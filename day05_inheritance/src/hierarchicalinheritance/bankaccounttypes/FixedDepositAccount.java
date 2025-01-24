package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    //fields
    public double FDamount;

    //constructor to initialize values
    public FixedDepositAccount(String accountHolder, int accountNumber, double balance, double FDamount) {
        super(accountHolder, accountNumber, balance);
        this.FDamount = FDamount;
    }
    //overriding method display()
    @Override
    public void display() {
        super.display();
        System.out.println("FD amount : " + this.FDamount);
    }
}
