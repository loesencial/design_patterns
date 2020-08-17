package Shapes;

import java.util.List;

/**
 * Implementing the AreaCalculator class this way breaks the OCP principle
 * Everytime a new shape is added, you need to change this class to calculate area for that shape
 */
public class AreaCalculatorViolatesOCP {
    public double calculateArea(List<Object> shapes) {
        double area = 0;
        for(Object shape: shapes) {
            if(shape.getClass().toString().contains("Rectangle"))
                area += ((RectangleViolatesOCP) shape).getWidth() * ((RectangleViolatesOCP) shape).getHeight();
            else if(shape.getClass().toString().contains("Circle"))
                area += Math.PI * ((CircleViolatesOCP) shape ).getRadius() * ((CircleViolatesOCP) shape ).getRadius();
        }

        return area;
    }
}
