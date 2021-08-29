package DesignPatterns.FactoryPattern.CarFactory;

import DesignPatterns.FactoryPattern.Cars.Car;
import DesignPatterns.FactoryPattern.Cars.HatchbackCar;
import DesignPatterns.FactoryPattern.Cars.SedanCar;
import DesignPatterns.FactoryPattern.Cars.SportsCar;
import DesignPatterns.FactoryPattern.Exceptions.InvalidTerrainException;

public class OptimiziedCarFactory implements CarFactory{
    @Override
    public Car createCar(Terrain terrain) throws InvalidTerrainException {
        if(terrain == Terrain.MOUNTAIN) {
            return new HatchbackCar();
        }
        else if(terrain == Terrain.CITY) {
            return new SedanCar();
        }
        else if(terrain == Terrain.RACETRACK) {
            return new SportsCar();
        } else {
            throw new InvalidTerrainException("This is not a valid terrain");
        }
    }
}
