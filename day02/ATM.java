// BankAccount class
class BankAccount {
    // Public field for account number
    public String accountNumber;

    // Protected field for account holder's name
    protected String accountHolder;

    // Private field for balance
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends BankAccount {

    // Constructor to initialize the SavingsAccount object
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display SavingsAccount-specific information
    public void displaySavingsAccountInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number: " + accountNumber); // Accessing public field (accountNumber)
        System.out.println("Account Holder: " + accountHolder); // Accessing protected field (accountHolder)
        displayAccountInfo(); // Calling the method from the base class to display full account details
    }
}

//ATM class (to test the implementation)
public class ATM {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount bankAccount = new BankAccount("1234567890", "John Doe", 5000.0);
        bankAccount.displayAccountInfo();

        // Modifying balance using setter method
        bankAccount.setBalance(6000.0);
        System.out.println("Updated Balance: " + bankAccount.getBalance());

        // Depositing money
        bankAccount.deposit(1000.0);
        System.out.println("New Balance after Deposit: " + bankAccount.getBalance());

        // Withdrawing money
        bankAccount.withdraw(1500.0);
        System.out.println("New Balance after Withdrawal: " + bankAccount.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("9876543210", "Alice Smith", 10000.0);
        savingsAccount.displaySavingsAccountInfo();
    }
}
