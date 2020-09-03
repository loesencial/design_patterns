package FluentBuilder;

public class DogWithType extends AnimalWithType {
    public DogWithType bark() {
        System.out.println("Dog barking");
        return this;
    }

    public DogWithType chaseTail() {
        System.out.println("Dog chasing tail");
        return this;
    }
}
