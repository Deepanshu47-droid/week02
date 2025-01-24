package hierarchicalinheritance.bankaccounttypes;

public class SavingAccount extends BankAccount {
    //fields
    public double interestRate;

    //constructor to initialize values
    public SavingAccount(String accountHolder, int accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }
    //overriding method display()
    @Override
    public void display() {
        super.display();
        System.out.println("Interest rate : " + this.interestRate);
    }
}
