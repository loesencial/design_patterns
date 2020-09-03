package StringBuilderExample;

public class StringBuilderDemo {
    // Reference: https://udemy.com/course/design-patterns-java (Builder pattern)
    public static void main(String[] args) {
        //If you just had one element, its easy enough to do with string concatenation
        String hello = "hello";
        System.out.println("<p>" + hello + "</p>");

        //Now if you have multiple elements and say you need to add them as an unordered list, it becomes more cumbersome
        //That is where the StringBuilder comes in. It uses the Builder pattern to allow you to build a String piecemeal
        String[] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for(String word: words)
            sb.append("  <li>" + word + "</li>\n");
        sb.append("</ul>");
        System.out.println(sb);
    }
}
