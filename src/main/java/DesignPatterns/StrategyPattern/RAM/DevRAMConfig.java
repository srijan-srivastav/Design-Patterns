package DesignPatterns.StrategyPattern.RAM;

public class DevRAMConfig implements IRAMConfig{
    @Override
    public String RAMConfiguration() {
        return "Use a 32GB ram configuration";
    }
}
