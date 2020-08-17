package EmailAccounts;

public abstract class IApplicant {
    abstract String getFirstName();
    abstract String getLastName();

    boolean isManager() {
        return false;
    }

    boolean isExecutive() {
        return false;
    }
}
