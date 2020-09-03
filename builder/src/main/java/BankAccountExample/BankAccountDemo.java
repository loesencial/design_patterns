package BankAccountExample;

public class BankAccountDemo {
    // Reference: https://dzone.com/articles/design-patterns-the-builder-pattern
    public static void main(String[] args) {
        BankAccount ba = new BankAccount.Builder().withAccount(12345)
                                                  .withOwner("John Doe")
                                                  .atLocation("123 Mulberry Ln")
                                                  .havingBalance(100000)
                                                  .withInterestRate(0.05)
                                                  .build();

        System.out.println(ba);
    }
}
