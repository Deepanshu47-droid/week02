package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    //fields
    public String accountHolder;
    public int accountNumber;
    public double balance;

    //constructor to initialize values
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //method to display details
    public void display() {
        System.out.println("Account Holder : " + this.accountHolder);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Balance : " + this.balance);
    }

}
