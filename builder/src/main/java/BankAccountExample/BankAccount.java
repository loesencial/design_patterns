package BankAccountExample;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private String location;
    private double balance;
    private double interestRate;

    private BankAccount(long accountNumber,
                        String owner,
                        String location,
                        double balance,
                        double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = location;
        this.location = location;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    public static class Builder {
        private long accountNumber;
        private String owner;
        private String location;
        private double balance;
        private double interestRate;

        public Builder withAccount(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder atLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder havingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder withInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(accountNumber,
                                   owner,
                                   location,
                                   balance,
                                   interestRate);
        }
    }
 }
