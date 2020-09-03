package HtmlBuilderExample;

public class HtmlBuilderDemo {
    // Reference: https://udemy.com/course/design-patterns-java (Builder pattern)
    public static void main(String[] args) {
        /*
        // This can also be converted to use the Fluent interface where you can chain the `addChild` commands
        HtmlBuilder ul = new HtmlBuilder("ul");
        ul.addChild("li", "hello");
        ul.addChild("li", "world!");
        System.out.println(ul);
         */

        // Using the Fluent interface
        HtmlBuilder ul = new HtmlBuilder("ul");
        ul.addChild("li", "hello")
          .addChild("li", "world!");
        System.out.println(ul);
    }
}
