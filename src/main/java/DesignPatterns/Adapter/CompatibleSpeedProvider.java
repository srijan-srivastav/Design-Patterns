package DesignPatterns.Adapter;

public class CompatibleSpeedProvider implements ISpeedProvider{

    @Override
    public double provideSpeedinKmph() {
        return 286.5;
    }
}
