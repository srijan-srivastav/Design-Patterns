package DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        SpeedClient speedClient = new SpeedClient(new CompatibleSpeedProvider(), new CompatiblitySpeedAdapter(new IncompatibleSpeedProvider()));
        speedClient.getSpeedInKmph();
    }
}
