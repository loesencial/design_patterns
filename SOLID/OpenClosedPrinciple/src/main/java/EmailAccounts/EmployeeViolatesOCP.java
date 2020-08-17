package EmailAccounts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeViolatesOCP {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean isManager = false;
    private boolean isExecutive = false;

    public EmployeeViolatesOCP(ApplicantViolatesOCP applicant) {
        this.firstName = applicant.getFirstName();
        this.lastName = applicant.getLastName();
        this.emailAddress = this.firstName.toLowerCase().substring(0, 1) + this.lastName.toLowerCase() + "@acme.com";

        if(applicant.getApplicantType() == ApplicantType.MANAGER)
            isManager = true;

        if(applicant.getApplicantType() == ApplicantType.EXECUTIVE) {
            isManager = true;
            isExecutive = true;
        }
    }
}
