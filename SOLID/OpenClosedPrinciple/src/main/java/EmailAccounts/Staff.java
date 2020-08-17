package EmailAccounts;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Staff extends IApplicant {
    private String firstName;
    private String lastName;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
