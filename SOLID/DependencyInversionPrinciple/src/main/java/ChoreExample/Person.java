package ChoreExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements IPerson {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
}
