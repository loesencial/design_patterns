package Employees;

public class ManagerViolatesLSP extends EmployeeViolatesLSP {
    @Override
    public double calculatePerHourRate(int rank) {
        double baseAmount = 17.5;
        salary = baseAmount + (rank * 4);

        return salary;
    }

    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance");
    }
}
