/*
 * Write a Java program to create a class called "BankAccount"
 * with attributes for account number, account holder's name, and balance. */

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount (long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    /*
     * Include methods for depositing and withdrawing money, as well as checking the balance. */
    public void deposit (double value) {
        if (value < 0) {
            System.out.println("Value cannot be negative.");
        } else {
            balance += value;
            System.out.println(value + " has been deposited. Balance is " + balance + ".");
        }
    }

    public void withdraw (double value) {
        if (value < 0) {
            System.out.println("Value cannot be negative.");
        } else if (value > balance) {
            System.out.println("Account balance is " + balance + ". Cannot withdraw " + value + ".");
        } else {
            balance += value;
            System.out.println(value + " has been deposited. Balance is " + balance + ".");
        }
    }

    public void checkBalance () {
        System.out.println(accountHolderName + "'s current balance is " + balance + ".");
    }

    public double getBalance () {
        return balance;
    }
}
