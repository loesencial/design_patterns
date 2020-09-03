package FacetedBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    // address
    private String streetAddress, zipCode, city;

    // employment
    private String companyName, position;
    private int annualIncome;
}
