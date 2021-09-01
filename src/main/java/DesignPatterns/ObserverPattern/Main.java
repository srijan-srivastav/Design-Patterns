package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.ExternalAPIClients.OpenWeatherAPIClient;
import DesignPatterns.ObserverPattern.Observables.WeatherStatus;
import DesignPatterns.ObserverPattern.Observers.WeatherApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        WeatherStatus weatherStatus = WeatherStatus.builder()
                .weatherClient(new OpenWeatherAPIClient())
                .subscribers(new ArrayList<>())
                .build();

        weatherStatus.startDataFetch();

        WeatherApp weatherApp = new WeatherApp();
        weatherStatus.subscribe(weatherApp);

    }
}
