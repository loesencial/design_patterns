package EmailAccounts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountProcessor {
    public static void main(String[] args) {
        List<IApplicant> applicants = Arrays.asList(
            new Staff("John", "Doe"),
            new Manager("Sylvia", "Doe"),
            new Executive("Henry", "Doe")
        );

        List<Employee> employees = new ArrayList<>();
        for(IApplicant applicant: applicants)
            employees.add(new Employee(applicant));

        for(Employee employee: employees) {
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
