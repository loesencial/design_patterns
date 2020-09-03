package FluentBuilder;

public class Demo {
    // Reference: http://www.eclecticlogic.com/2016/12/31/fluent-interfaces-generics/
    // Reference: https://udemy.com/course/design-patterns-java (Builder pattern)
    public static void main(String[] args) {
        // This will not work as is because eat("bone") will return an Animal which does not have knowledge of bark()
        // Animal a = new Dog().eat("bone").bark();

        // You can switch up the methods but this might not always be possible
        Animal a = new Dog().bark().eat("bone");

        // If you do not want to use Recursive Generics, then you can use a special kind of typing/casting
        // With this kind of typing, while the DogWithTyping only has to extend AnimalWithTyping, the caller has to have knowledge to cast
        AnimalWithType at = new DogWithType().eat("bone").<DogWithType> typed().bark();

        // When using Recursive Generics
        // You can now call either the parent class methods or the Dog specific methods
        AnimalWithRecursiveGenerics<DogWithRecursiveGenerics> dog = new AnimalWithRecursiveGenerics<>();
        dog.eat("bone").bark();
    }
}
