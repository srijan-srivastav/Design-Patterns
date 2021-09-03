package DesignPatterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane.AirplaneBuilder()
                .withMaterial(new Material("Carbon fibre", 173.2, 188.9))
                .withEngine(new Engine(Engine.Type.OCTA, Engine.Type.OCTA.weight))
                .withStaff(new Staff(15,2))
                .build();

        System.out.println(airplane);
    }
}
