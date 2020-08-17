package Shapes;

import java.util.List;

public class AreaCalculator {
    public double calculateArea(List<Shape> shapes) {
        double area = 0.0;
        for(Shape shape: shapes)
            area += shape.calculateArea();
        return area;
    }
}
