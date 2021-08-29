package DesignPatterns.FactoryPattern.CarFactory;

public interface FactoryGenerator<T> {
    T createFactory(String param);
}
