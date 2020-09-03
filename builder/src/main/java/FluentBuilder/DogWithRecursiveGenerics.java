package FluentBuilder;

/**
 * DogWithRecursiveGenerics is extending AnimalWithRecursiveGenerics<DogWithRecursiveGenerics>, not just AnimalWithRecursiveGenerics
 */
public class DogWithRecursiveGenerics extends AnimalWithRecursiveGenerics<DogWithRecursiveGenerics> {
    public DogWithRecursiveGenerics bark() {
        System.out.println("Dog barking");
        return this;
    }

    public DogWithRecursiveGenerics chaseTail() {
        System.out.println("Dog chasing tail");
        return this;
    }
}
