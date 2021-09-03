package DesignPatterns.BuilderPattern;

import lombok.ToString;

@ToString
public class Airplane {
    private Material material;
    private Engine engine;
    private Staff staff;

    private Airplane(AirplaneBuilder airplaneBuilder){
        this.material = airplaneBuilder.material;
        this.engine = airplaneBuilder.engine;
        this.staff = airplaneBuilder.staff;
    }

    public static class AirplaneBuilder {
        private Material material;
        private Engine engine;
        private Staff staff;

        AirplaneBuilder() {

        }

        public AirplaneBuilder withMaterial(Material material) {
            this.material = material;
            return this;
        }

        public AirplaneBuilder withEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public AirplaneBuilder withStaff(Staff staff) {
            this.staff = staff;
            return this;
        }

        public Airplane build() {
            return new Airplane(this);
        }

    }
}
