package HtmlBuilderExample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class HtmlElement {
    @Getter @Setter private String name, text;
    @Getter @Setter private List<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString(){
        return toStringImpl(0);
    }

    private String toStringImpl(int indentLevel) {
        StringBuilder sb = new StringBuilder();
        String indent = String.join("", Collections.nCopies(indentLevel * indentSize, " "));
        sb.append(String.format("%s<%s>%s", indent, this.getName(), newLine));
        if(this.getText() != null && !this.getText().isEmpty()) {
            sb.append(String.join("", Collections.nCopies((indentLevel+1) * indentSize, " ")));
            sb.append(this.getText());
            sb.append(newLine);
        }
        for(HtmlElement htmlElement: elements)
            sb.append(htmlElement.toStringImpl(indentLevel + 1));

        sb.append(String.format("%s</%s>%s", indent, this.getName(), newLine));

        return sb.toString();
    }
}
