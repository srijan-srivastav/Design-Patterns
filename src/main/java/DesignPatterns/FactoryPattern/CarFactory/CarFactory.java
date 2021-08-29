package DesignPatterns.FactoryPattern.CarFactory;

import DesignPatterns.FactoryPattern.Cars.Car;
import DesignPatterns.FactoryPattern.Exceptions.InvalidTerrainException;

public interface CarFactory {
    Car createCar(Terrain terrain) throws InvalidTerrainException;
}
