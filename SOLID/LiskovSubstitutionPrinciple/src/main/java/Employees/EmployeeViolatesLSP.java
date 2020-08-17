package Employees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeViolatesLSP {
    protected String firstName;
    protected String lastName;
    protected EmployeeViolatesLSP manager = null;
    protected double salary;

    public void assignManager(EmployeeViolatesLSP manager) {
        this.manager = manager;
    }

    public double calculatePerHourRate(int rank) {
        double baseAmount = 12.5;
        salary = baseAmount + (rank * 2);

        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", manager=" + manager +
                ", salary=" + salary +
                '}';
    }
}
