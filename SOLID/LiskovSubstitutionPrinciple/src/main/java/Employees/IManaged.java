package Employees;

public interface IManaged extends IEmployee {
    void assignManager(IEmployee manager);
}
