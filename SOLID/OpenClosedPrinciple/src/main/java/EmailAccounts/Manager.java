package EmailAccounts;

public class Manager extends IApplicant {
    private String firstName;
    private String lastName;
    private boolean isManager = true;

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean isManager() {
        return isManager;
    }
}
