package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Processors.IProcessor;
import DesignPatterns.StrategyPattern.Processors.ProcessorSimpleFactory;
import DesignPatterns.StrategyPattern.Processors.Processors;
import DesignPatterns.StrategyPattern.RAM.IRAMConfig;
import DesignPatterns.StrategyPattern.RAM.RAMSimpleFactory;
import DesignPatterns.StrategyPattern.RAM.UserType;

public class Laptop implements IComputer{
    private final Configuration laptopConfiguration;
    private IProcessor processor;
    private IRAMConfig ramConfig;

    public Laptop(Configuration configuration) {
        this.laptopConfiguration = configuration;
        this.processor = ProcessorSimpleFactory.createProcessor(configuration.getProcessor());
        this.ramConfig = RAMSimpleFactory.createRAMConfig(configuration.getUserType());
    }

    public IProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(Processors processor) {
        this.processor = ProcessorSimpleFactory.createProcessor(processor);
        this.laptopConfiguration.setProcessor(processor);
    }

    public IRAMConfig getRamConfig() {
        return ramConfig;
    }

    public void setRamConfig(UserType userType) {
        this.ramConfig = RAMSimpleFactory.createRAMConfig(userType);
        this.laptopConfiguration.setUserType(userType);
    }
}
