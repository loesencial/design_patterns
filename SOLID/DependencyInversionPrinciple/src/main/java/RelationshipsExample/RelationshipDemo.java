package RelationshipsExample;

/**
 * Dependency Inversion Principle states that High-level modules should not depend on low-level modules
 * Both should depend on abstractions
 *
 * Abstractions should not depend on details
 * Details should depend on abstractions
 */
public class RelationshipDemo
{
    public static void main( String[] args ) {
        Person parent = new Person("John");
        Person child1 = new Person("Matt");
        Person child2 = new Person("Henry");

        /**
         * The approach below violates the Dependency Inversion Principle
         * Research which is a high-level class is tied with the data structure implementation of the Relationships class
         *
         */
        Relationships relationships1 = new Relationships();
        relationships1.addParentAndChild(parent, child1);
        relationships1.addParentAndChild(parent, child2);
        new Research(relationships1);

        /**
         * The difference here is subtle. We now have an interface which Relationships implements
         * The details of the implementation lies with the Relationships class
         * All we get back is the List of children that "John" has
         */
        RelationshipBrowser relationships2 = relationships1;
        new Research(relationships2);
    }
}
