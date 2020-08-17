package Employees;

public class Manager extends Employee implements IManager {
    @Override
    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance");
    }

    @Override
    public double calculatePerHourRate(int rank) {
        double baseAmount = 17.5;
        salary = baseAmount + (rank * 4);

        return salary;
    }
}
