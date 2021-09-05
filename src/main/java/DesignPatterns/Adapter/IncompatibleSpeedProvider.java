package DesignPatterns.Adapter;

public class IncompatibleSpeedProvider implements ISpeedProvider {
    @Override
    public double provideSpeedinKmph() {
        return 105.67;
    }
}
