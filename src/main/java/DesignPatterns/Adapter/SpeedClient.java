package DesignPatterns.Adapter;

public class SpeedClient {
    private final ISpeedProvider compatibleSpeedProvider;
    private final ISpeedProvider compatibilitySpeedAdapter;

    SpeedClient(ISpeedProvider compatibleSpeedProvider, ISpeedProvider compatibilitySpeedAdapter) {
        this.compatibilitySpeedAdapter = compatibilitySpeedAdapter;
        this.compatibleSpeedProvider = compatibleSpeedProvider;
    }

    public void getSpeedInKmph() {
        System.out.println(compatibilitySpeedAdapter.provideSpeedinKmph());
        System.out.println(compatibleSpeedProvider.provideSpeedinKmph());
    }
}
