package Employees;

public class CEO extends BaseEmployee implements IManager {
    @Override
    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance");
    }

    public void fireSomeone() {
        System.out.println("I am firing someone");
    }
}
