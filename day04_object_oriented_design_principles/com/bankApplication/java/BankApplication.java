package com.bankApplication;
import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    private String name;
    // Association with Customer
    private List<Customer> customers;

    // Constructor to initialize variables
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open a new account for a customer
    public void openAccount(String customerName, String accountType, double initialBalance) {
        Customer customer = findCustomerByName(customerName);
        if (customer == null) {
            // Associating customer with this bank
            customer = new Customer(customerName, this);
            customers.add(customer);
        }
        customer.addAccount(accountType, initialBalance);
        System.out.println("Account opened successfully for " + customerName + " with type " + accountType + ".");
    }

    // Method to find a customer by name
    private Customer findCustomerByName(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    // Method to display all customers and their accounts
    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            customer.displayAccounts();
        }
    }
}

// Customer class
class Customer {
    private String name;
    // Association with Bank
    private Bank bank;
    // A customer can have multiple accounts
    private List<Account> accounts;

    // Constructor to initialize Customer
    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account for the customer
    public void addAccount(String accountType, double initialBalance) {
        accounts.add(new Account(accountType, initialBalance));
    }

    // Method to view balance of all accounts
    public void displayAccounts() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("  Account Type: " + account.getAccountType() + ", Balance: " + account.getBalance());
        }
    }

    // Getter for customer name
    public String getName() {
        return name;
    }
}

// Account class
class Account {
    private String accountType;
    private double balance;

    // Constructor to initialize Account
    public Account(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getter for account type
    public String getAccountType() {
        return accountType;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Main class to test the implementation
public class BankApplication {
    public static void main(String[] args) {
        // Creating a Bank
        Bank bank = new Bank("National Bank");

        // Opening accounts for customers
        bank.openAccount("Alice", "Savings", 1000.0);
        bank.openAccount("Bob", "Current", 2000.0);
        bank.openAccount("Alice", "Current", 1500.0);

        // Displaying customers and their accounts
        bank.displayCustomers();

    }
}
