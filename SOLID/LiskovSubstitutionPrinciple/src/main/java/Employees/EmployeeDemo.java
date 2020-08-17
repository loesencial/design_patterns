package Employees;

public class EmployeeDemo {
    public static void main(String[] args) throws Exception {
        ManagerViolatesLSP accountingVP = new ManagerViolatesLSP();
        accountingVP.setFirstName("Emma");
        accountingVP.setLastName("Stone");
        accountingVP.calculatePerHourRate(4);
        System.out.println("When violating LSP");
        System.out.println(accountingVP);

        /**
         * This is a violation of LSP
         * LSP specifies that an inherited class can replace the parent class anywhere without breaking the application
         * In our case below, if you do Employee emp = new Manager(), it works fine
         * However, if you do Employee emp = new CEO(), it throws an exception because CEO cannot have a manager
         *
         * Co-variance: changing the return type of an overridden method (not possible in Java anyway)
         * Contra-variance: changing the input type of an overridden method (not possible in Java anyway)
         *
         * Pre-condition: One more thing LSP mentions is that we cannot strengthen any pre-conditions.
         * For e.g. when 'calculatePerHourRate' is taking in 'rank' in Mananger, it cannot specify any conditional on the 'rank' it takes in
         * It cannot say if(rank < 3) throw new RuntimeException()
         *
         * Post-condition: Similarly LSP also cannot weaken post-condition. In this case, the salary that is being returned cannot be weakened
         */
        EmployeeViolatesLSP emp = new EmployeeViolatesLSP();
        emp.setFirstName("John");
        emp.setLastName("Doe");
        emp.assignManager(accountingVP);
        emp.calculatePerHourRate(2);
        System.out.println(emp);

        /**
         * What LSP does is focus on whether inheritance truly represents an "is-a" relationship
         * In the example above, CEO is not truly an Employee because s/he is not managed by anyone
         * In this case, on approach is to build this composition/inheritance heirarachy that can reuse existing code
         * and at the same time not violate LSP
         */

        System.out.println("When not violating LSP");
        Employee accountingVP1 = new Manager();
        accountingVP1.setFirstName("Emma");
        accountingVP1.setLastName("Stone");
        accountingVP1.calculatePerHourRate(4);
        System.out.println(accountingVP1);

        Employee emp1 = new Employee();
        emp1.setFirstName("John");
        emp1.setLastName("Doe");
        emp1.assignManager(accountingVP1);
        emp1.calculatePerHourRate(2);
        System.out.println(emp1);

    }
}
