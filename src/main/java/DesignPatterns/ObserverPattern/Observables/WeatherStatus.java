package DesignPatterns.ObserverPattern.Observables;

import DesignPatterns.ObserverPattern.ExternalAPIClients.IAPIClient;
import DesignPatterns.ObserverPattern.Observers.IObserver;
import lombok.Builder;
import lombok.Getter;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@Builder
public class WeatherStatus implements IObservable {
    @Getter
    private double temperature = 0;
    @Getter
    private double humidity = 0;

    IAPIClient weatherClient;
    List<IObserver> subscribers;

    @Override
    public void subscribe(IObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(IObserver subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void startDataFetch() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                parseAndUpdateFromResponse(weatherClient.callAPI());
                System.out.println("Calling notify!");
                notifySubscribers();
            }
        },0,10000);
    }

    private void parseAndUpdateFromResponse(String response) {
        try {
            JSONArray jsonArray = (JSONArray) new JSONParser().parse(response);
            // do something to set the object fields

        }
        catch (ParseException e) {
            System.out.println("Parsing failed");
        }

    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifySubscribers();
    }


    public void setHumidity(double humidity) {
        this.humidity = humidity;
        this.notifySubscribers();
    }


}
