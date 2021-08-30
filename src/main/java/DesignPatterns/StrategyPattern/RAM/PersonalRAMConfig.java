package DesignPatterns.StrategyPattern.RAM;

public class PersonalRAMConfig implements IRAMConfig {
    @Override
    public String RAMConfiguration() {
        return "Use a 8GB RAM configuration";
    }
}
