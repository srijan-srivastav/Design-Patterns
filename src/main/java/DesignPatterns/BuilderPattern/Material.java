package DesignPatterns.BuilderPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Material {
    private String name;
    private double weightPerMeter;
    private double costPerMeter;
}
