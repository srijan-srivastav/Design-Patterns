package DesignPatterns.FactoryPattern.Cars;

public class SportsCar implements Car{
    private String registrationNumber;
    private static final int GEARS = 6;

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String makeNoise() {
        return "Sports car noise";
    }

    @Override
    public int gears() {
        return GEARS;
    }
}
