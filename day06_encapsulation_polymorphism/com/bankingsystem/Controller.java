package com.bankingsystem;

public class Controller {
    public static void main(String[] args) {
        // Creating accounts
        BankAccount savingsAccount = new SavingsAccount("SA12345", "Deepanshu", 8000);
        BankAccount currentAccount = new CurrentAccount("CA54321", "Karan", 15000);

        // Processing saving account
        System.out.println("Processing Savings Account:");
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        System.out.println("Interest Earned: " + savingsAccount.calculateInterest());
        ((Loanable) savingsAccount).applyForLoan(5000);
        System.out.println("-------------------------------------");

        // Processing saving account
        System.out.println("Processing Current Account:");
        currentAccount.deposit(5000);
        currentAccount.withdraw(3000);
        System.out.println("Interest Earned: " + currentAccount.calculateInterest());
        ((Loanable) currentAccount).applyForLoan(10000);
        System.out.println("-------------------------------------");
    }
}
