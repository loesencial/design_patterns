package EmailAccounts;

import lombok.Getter;

@Getter
public class Employee {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean isManager;
    private boolean isExecutive;

    //TODO: how to handle multiple "kinds" of employees, say if manager had a different format for emailAddress?
    public Employee(IApplicant applicant) {
        this.firstName = applicant.getFirstName();
        this.lastName = applicant.getLastName();
        this.emailAddress = this.firstName.toLowerCase().substring(0, 1) + this.lastName.toLowerCase() + "@acme.com";
        this.isManager = applicant.isManager();
        this.isExecutive = applicant.isExecutive();
    }

}
