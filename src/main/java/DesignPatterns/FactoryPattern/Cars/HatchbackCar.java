package DesignPatterns.FactoryPattern.Cars;

public class HatchbackCar implements Car{

    private String registrationNumber;
    private static final int GEARS = 4;

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String makeNoise() {
        return "Hatchback noise";
    }

    @Override
    public int gears() {
        return GEARS;
    }
}
