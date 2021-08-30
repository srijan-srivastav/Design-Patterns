package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Processors.Processors;
import DesignPatterns.StrategyPattern.RAM.UserType;

public class Configuration {
    private final String name;
    private Processors processor;
    private UserType userType;

    public Configuration(String name, Processors processor, UserType userType) {
        this.name = name;
        this.processor = processor;
        this.userType = userType;
    }

    public Processors getProcessor() {
        return processor;
    }

    public void setProcessor(Processors processor) {
        this.processor = processor;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}
