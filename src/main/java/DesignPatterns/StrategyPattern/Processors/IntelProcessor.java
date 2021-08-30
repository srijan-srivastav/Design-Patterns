package DesignPatterns.StrategyPattern.Processors;

public class IntelProcessor implements IProcessor{
    @Override
    public String processor() {
        return "Use the Intel i9 processor";
    }
}
