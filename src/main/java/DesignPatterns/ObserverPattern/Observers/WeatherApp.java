package DesignPatterns.ObserverPattern.Observers;

import DesignPatterns.ObserverPattern.Observables.IObservable;
import DesignPatterns.ObserverPattern.Observables.WeatherStatus;
import lombok.Getter;

public class WeatherApp implements IObserver {
    @Getter
    private double temperature;
    @Getter
    private double humidity;

    @Override
    public void update(IObservable observable) {
        WeatherStatus weatherStatus = (WeatherStatus) observable;
        System.out.println("Got notified!!");
        this.temperature = weatherStatus.getTemperature();
        this.humidity = weatherStatus.getHumidity();
    }

}
