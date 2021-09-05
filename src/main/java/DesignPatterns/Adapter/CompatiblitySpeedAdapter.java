package DesignPatterns.Adapter;

public class CompatiblitySpeedAdapter implements ISpeedProvider{
    private final IncompatibleSpeedProvider incompatibleSpeedProvider;

    public CompatiblitySpeedAdapter(IncompatibleSpeedProvider incompatibleSpeedProvider) {
        this.incompatibleSpeedProvider = incompatibleSpeedProvider;
    }


    @Override
    public double provideSpeedinKmph() {
        return convertMphToKmph(this.incompatibleSpeedProvider.provideSpeedinKmph());
    }

    private double convertMphToKmph(double kmphSpeed) {
        return 286.5;
    }
}
