package CodeBuilderExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InstanceField {
    private String fieldName;
    private String fieldType;
    private final String fieldAccessLevel = "public";
    private final String wordSpacing = " ";
    private final String lineEnding = ";";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fieldAccessLevel);
        sb.append(wordSpacing);
        sb.append(fieldType);
        sb.append(wordSpacing);
        sb.append(fieldName);
        sb.append(lineEnding);

        return sb.toString();
    }
}
