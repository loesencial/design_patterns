package Shapes;

public class ShapesDemo
{
    public static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        // area = width * 10
        System.out.println("Expected area of " + (width*10) + ", got " + r.getArea());
    }

    public static void main( String[] args )
    {
        Rectangle r = new Rectangle(2, 3);
        useIt(r);

        /**
         * This demonstrates the fault with extending the Rectangle class
         * It violates the Liskov Substitution Principle, because the subclass behaves differently than it's parent class
         */
        Rectangle s = new Square();
        s.setWidth(5);
        useIt(s);

        /**
         * Instead of using a separate Square class, you could just create a RectangleFactory class that creates a Square
         * or a Rectangle
         */
        System.out.println("Using the RectangleFactory");
        Rectangle r1 = RectangleFactory.newRectangle(2, 3);
        useIt(r1);
        Rectangle s1 = RectangleFactory.newSquare(10);
        useIt(s1);
    }
}
