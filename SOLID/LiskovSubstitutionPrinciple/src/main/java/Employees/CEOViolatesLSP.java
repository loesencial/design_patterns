package Employees;

public class CEOViolatesLSP extends EmployeeViolatesLSP {
    @Override
    public double calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
        return salary;
    }

    @Override
    public void assignManager(EmployeeViolatesLSP manager) {
        throw new RuntimeException("CEO cannot have manager");
    }

    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance");
    }

    public void fireSomeone() {
        System.out.println("I am firing someone");
    }
}
