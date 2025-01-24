package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {
    //fields
    public double withdrawLimit;

    //constructor to initialize values
    public CheckingAccount(String accountHolder, int accountNumber, double balance, double withdrawLimit) {
        super(accountHolder, accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }
    //overriding method display()
    @Override
    public void display() {
        super.display();
        System.out.println("Withdraw limit : " + this.withdrawLimit);
    }
}
