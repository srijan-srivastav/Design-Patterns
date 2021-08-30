package DesignPatterns.StrategyPattern.Processors;

public class ProcessorSimpleFactory {
    public static IProcessor createProcessor(Processors type) {
        if(type == Processors.A1BIONIC) {
            return new A1BionicProcessor();
        }
        else if(type == Processors.INTELI9) {
            return new IntelProcessor();
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
