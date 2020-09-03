package FluentBuilder;

public class Dog extends Animal {
    public Dog bark() {
        System.out.println("Dog barking");
        return this;
    }

    public Dog chaseTail() {
        System.out.println("Dog chasing tail");
        return this;
    }
}
