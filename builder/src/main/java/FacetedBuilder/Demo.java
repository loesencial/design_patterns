package FacetedBuilder;

public class Demo {
    // Reference: https://udemy.com/course/design-patterns-java (Builder pattern)
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                            .lives()
                                .atStreet("123 Mulberry Ln")
                                .withZip("12345")
                                .in("New York")
                            .works()
                                .atCompany("Not a real company")
                                .as("Software Engineer")
                                .earning(100000)
                            .build();
        System.out.println(person);
    }
}
