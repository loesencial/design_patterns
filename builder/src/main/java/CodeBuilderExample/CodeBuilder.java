package CodeBuilderExample;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CodeBuilder {
    private String className;
    private List<InstanceField> fields;
    private final String classAccessLevel = "public";
    private final String classIdentifier = "class";
    private final String wordSpacing = " ";
    private final String openBlock = "{";
    private final String closeBlock = "}";
    private final String indent = "\t";
    private final String newLine = System.lineSeparator();

    public CodeBuilder(String className) {
        this.className = className;
        this.fields = new ArrayList<>();
    }

    public CodeBuilder addField(String fieldName, String fieldType) {
        fields.add(new InstanceField(fieldName, fieldType));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // begin class definition
        sb.append(classAccessLevel)
                .append(wordSpacing)
                .append(classIdentifier)
                .append(wordSpacing)
                .append(this.className)
                .append(wordSpacing)
                .append(openBlock)
                .append(newLine);

        // build instance fields
        for(InstanceField field: fields) {
            sb.append(indent);
            sb.append(field);
            sb.append(newLine);
        }

        // close class definition
        sb.append(closeBlock);

        return sb.toString();
    }
}
