package HouseBuilderExample;

/**
 * This is another approach to using the Builder pattern and has the following UML actors
 * Product: The actual objects being built
 * Builder: Creates and assembles the Product object
 * Director: Refers to the Builder interface for building the objects, that way it is independent of which objects are being created
 */
public class Demo {
    // Reference: https://en.wikipedia.org/wiki/Builder_pattern
    // Reference: https://www.geeksforgeeks.org/builder-design-pattern/
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        House house = engineer.getHouse();
        System.out.println(house);
    }
}
