package DesignPatterns.BuilderPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Engine {
    private Type engineType;
    private double weight;
    public enum Type {
        SINGLE(100), DOUBLE(200), QUAD(400), OCTA(800);
        public double weight;
        Type(double weight) {
            this.weight = weight;
        }
    }
}


