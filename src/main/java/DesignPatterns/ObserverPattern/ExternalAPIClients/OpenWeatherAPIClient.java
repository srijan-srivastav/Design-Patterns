package DesignPatterns.ObserverPattern.ExternalAPIClients;

import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OpenWeatherAPIClient implements IAPIClient {

    @Override
    public String callAPI() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://dataservice.accuweather.com/currentconditions/v1/21843?apikey=1Ws4iMgPQgnOjVI4tpbJGoUcr4P7uhsi"))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient
                    .newBuilder()
                    .proxy(ProxySelector.getDefault())
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        }
        catch (URISyntaxException e) {
            System.out.println("Invalid Endpoint" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Something went wrong!";
    }
}