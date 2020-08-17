package EmailAccounts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantViolatesOCP {
    private String firstName;
    private String lastName;
    private ApplicantType applicantType;

    public ApplicantViolatesOCP(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.applicantType = ApplicantType.STAFF;
    }

    public ApplicantViolatesOCP(String firstName, String lastName, ApplicantType applicantType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.applicantType = applicantType;
    }
}

enum ApplicantType {
    STAFF,
    MANAGER,
    EXECUTIVE
}