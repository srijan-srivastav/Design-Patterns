package DesignPatterns.FactoryPattern.CarFactory;

public class CarFactoryGenerator implements FactoryGenerator<CarFactory> {
    public CarFactory createFactory(String type) {
        if(type.equalsIgnoreCase("Biased")) {
            return new BiasedCarFactory();
        }
        else {
            return new OptimiziedCarFactory();
        }
    }

}
