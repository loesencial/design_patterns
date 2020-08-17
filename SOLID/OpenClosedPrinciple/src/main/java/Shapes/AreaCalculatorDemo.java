package Shapes;

import java.util.Arrays;
import java.util.List;

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        // Violating OCP
        RectangleViolatesOCP r1 = new RectangleViolatesOCP(10, 12);
        RectangleViolatesOCP r2 = new RectangleViolatesOCP(4, 7);
        CircleViolatesOCP c1 = new CircleViolatesOCP(3);
        List<Object> objects = Arrays.asList(r1, r2, c1);

        AreaCalculatorViolatesOCP ac1 = new AreaCalculatorViolatesOCP();
        double totalArea1 = ac1.calculateArea(objects);
        System.out.println("Total Area (old): " + totalArea1);

        // Satisfying OCP
        Shape r3 = new Rectangle(10, 12);
        Shape r4 = new Rectangle(4, 7);
        Shape c2 = new Circle(3);
        List<Shape> shapes = Arrays.asList(r3, r4, c2);

        AreaCalculator ac2 = new AreaCalculator();
        double totalArea2 = ac2.calculateArea(shapes);
        System.out.println("Total Area (new): " + totalArea2);
    }
}
