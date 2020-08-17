package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Circle extends Shape implements Area {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
