package Employees;

import lombok.Getter;
import lombok.Setter;

public abstract class BaseEmployee implements IEmployee {
    @Getter @Setter protected String firstName;
    @Getter @Setter protected String lastName;
    protected double salary;

    @Override
    public double calculatePerHourRate(int rank) {
        double baseAmount = 12.5;
        salary = baseAmount + (rank * 2);

        return salary;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
