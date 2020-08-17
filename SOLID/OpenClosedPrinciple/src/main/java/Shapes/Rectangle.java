package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle extends Shape implements Area {
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return this.getWidth() * this.getHeight();
    }

}
