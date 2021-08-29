package DesignPatterns.FactoryPattern.Cars;

public class SedanCar implements Car{
    private String registrationNumber;
    private static final int GEARS = 5;

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String makeNoise() {
        return "Sedan car noise";
    }

    @Override
    public int gears() {
        return GEARS;
    }
}
