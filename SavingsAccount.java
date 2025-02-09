/*
 * Create a subclass called "SavingsAccount" that adds an interest rate attribute
 * and a method to apply interest. */

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest () {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("With " + interestRate + "% interest, balance now is " + getBalance());
    }
}
