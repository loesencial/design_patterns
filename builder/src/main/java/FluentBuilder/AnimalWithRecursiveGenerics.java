package FluentBuilder;

/**
 * We have added recursive generics to the AnimalWithRecursiveGenerics class
 * A is now bounded to be sub class of AnimalWithRecursiveGenerics
 * The methods return A instead of AnimalWithRecursiveGenerics
 */
public class AnimalWithRecursiveGenerics<A extends AnimalWithRecursiveGenerics<A>> {
    public A eat(String food) {
        System.out.println(food + " consumed");
        return (A)this;
    }

    public A run(int distance) {
        System.out.println("ran " + distance + " miles");
        return (A)this;
    }
}
