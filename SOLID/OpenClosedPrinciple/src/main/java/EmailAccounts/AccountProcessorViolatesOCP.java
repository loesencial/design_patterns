package EmailAccounts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This violates OCP
 * Everytime we need to add an applicant type, we need to update ApplicantType and Employee classes
 */
public class AccountProcessorViolatesOCP {
    public static void main(String[] args) {
        List<ApplicantViolatesOCP> applicants = Arrays.asList(
                new ApplicantViolatesOCP("John", "Doe"),
                new ApplicantViolatesOCP("Sylvia", "Doe", ApplicantType.MANAGER),
                new ApplicantViolatesOCP("Henry", "Doe", ApplicantType.EXECUTIVE)
        );

        List<EmployeeViolatesOCP> employees = new ArrayList<>();
        for(ApplicantViolatesOCP applicant: applicants)
            employees.add(new EmployeeViolatesOCP(applicant));

        for(EmployeeViolatesOCP employee: employees) {
            String out = String.format("%s %s, %s isManager:%s isExecutive:%s",
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getEmailAddress(),
                    employee.isManager(),
                    employee.isExecutive());
            System.out.println(out);
        }
    }
}
