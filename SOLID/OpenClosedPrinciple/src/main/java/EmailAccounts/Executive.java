package EmailAccounts;

public class Executive extends IApplicant {
    private String firstName;
    private String lastName;
    private boolean isManager = true;
    private boolean isExecutive = true;

    public Executive(String firstName, String lastName) {
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
        return this.isManager;
    }

    @Override
    public boolean isExecutive() {
        return this.isExecutive;
    }
}
