package CodeBuilderExample;

public class CodeBuilderDemo {
    // Reference: https://udemy.com/course/design-patterns-java (Builder pattern)
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("firstName", "String")
                .addField("lastName", "String")
                .addField("age", "int");

        System.out.println(cb);
    }
}
