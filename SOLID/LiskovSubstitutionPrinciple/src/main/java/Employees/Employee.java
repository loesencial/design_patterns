package Employees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends BaseEmployee implements IManaged {
    private IEmployee manager;

    @Override
    public void assignManager(IEmployee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "manager=" + manager +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
