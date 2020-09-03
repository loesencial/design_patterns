package FluentBuilder;

public class Animal {
    public Animal eat(String food) {
        System.out.println(food + " consumed");
        return this;
    }

    public Animal run(int distance) {
        System.out.println("ran " + distance + " miles");
        return this;
    }
}
