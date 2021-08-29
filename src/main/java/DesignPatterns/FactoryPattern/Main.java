package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.CarFactory.CarFactory;
import DesignPatterns.FactoryPattern.CarFactory.CarFactoryGenerator;
import DesignPatterns.FactoryPattern.CarFactory.FactoryGenerator;
import DesignPatterns.FactoryPattern.CarFactory.Terrain;
import DesignPatterns.FactoryPattern.Cars.Car;
import DesignPatterns.FactoryPattern.Exceptions.InvalidTerrainException;

public class Main {
    public static void main(String[] args) throws InvalidTerrainException {
        FactoryGenerator<CarFactory> carFactoryGenerator = new CarFactoryGenerator();
        CarFactory carFactory = carFactoryGenerator.createFactory("Optimized");

        int temp = 3;

        try {
            Car car = carFactory.createCar(Terrain.RACETRACK);
            System.out.println(car.makeNoise());
        } catch (InvalidTerrainException e) {
            System.out.println(e.getMessage());
        }

    }
}
