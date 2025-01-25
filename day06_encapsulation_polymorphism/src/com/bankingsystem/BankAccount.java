package com.bankingsystem;

abstract class BankAccount {
    //fields
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor to initialize values
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    // Concrete Method: Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Concrete Method: method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Abstract Method: to calculate interest
    public abstract double calculateInterest();

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }
}