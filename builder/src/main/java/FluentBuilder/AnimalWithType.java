package FluentBuilder;

public class AnimalWithType {
    public AnimalWithType eat(String food) {
        System.out.println(food + " consumed");
        return this;
    }

    public AnimalWithType run(int distance) {
        System.out.println("ran " + distance + " miles");
        return this;
    }

    // this method specifies that it returns a type of the class which extends AnimalWithType
    public <T extends AnimalWithType> T typed() {
        return (T) this;
    }
}
