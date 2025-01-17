import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance = 0;

    //method to deposit money
    public void deposit(double amount) {
        //increasing the balance with amount
        this.balance += amount;
    }
    //method to open a account (constructor)
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    //method to withdraw money
    public void withdraw(double amount) {
        //checking if amount is valid and balance is sufficient to withdraw
        if(amount >= 0 && this.balance >= amount) {
            //decreasing withdraw amount from balance
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance..");
        }
    }
    //method to display current balance
    public void displayBalance() {
        System.out.println("your current balance is : " + this.balance);
    }
}
public class ATM {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);

        //taking user input for account holder and account number
        System.out.print("Enter your name : ");
        String accountHolder = input.nextLine();
        System.out.print("Enter your account number : ");
        String accountNumber = input.nextLine();

        //creating object
        BankAccount account = new BankAccount(accountHolder, accountNumber);

        while(true) {
            System.out.println("press \n1------>deposit\n2--------->withdraw\n3------------>check balance");

            //creating a variable choice to indicate users choice for operations
            int choice = input.nextInt();

            if(choice == 1) {
                System.out.print("Enter amount : ");
                account.deposit(input.nextDouble());
            } else if (choice == 2) {
                System.out.print("Enter amount : ");
                account.withdraw(input.nextDouble());
            } else if (choice == 3) {
                account.displayBalance();
            } else {
                System.out.println("Invalid choice...");
            }
            //exiting if user want else continuing
            System.out.println("Enter 0 to exit else press any key ....");
            if(input.nextInt() == 0) {
                break;
            }
        }

        //closing the input
        input.close();
    }
}