public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BankAccount someonesAccount = new BankAccount(1212343456, "Someone", 0);
        someonesAccount.deposit(500);
        someonesAccount.withdraw(600);
        someonesAccount.checkBalance();

        System.out.println();

        SavingsAccount someonesSavings = new SavingsAccount(1357135720, "Someone 2", 0, 2.0);
        someonesSavings.checkBalance();
        someonesSavings.deposit(1000);
        someonesSavings.applyInterest();
    }
}