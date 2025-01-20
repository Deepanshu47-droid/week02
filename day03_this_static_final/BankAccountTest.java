import java.util.Scanner;
class BankAccount {
    //creating static variables bankName and totalAccounts to indicate the name of bank and total number of accounts created
    static String bankName;
    private static int totalAccounts;

    //creating variables accountHolderName to indicate account holder's name
    private String accountHolderName;

    //creating final variable accountNumber to indicate the account number it cannot be changed
    private final long accountNumber;

    //constructor to initialize values
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        totalAccounts++;
    }
    //method to get total number of accounts created
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    //method to print details
    public void display() {
        System.out.println("Bank name : " + bankName);
        System.out.println("Account holder name : " + this.accountHolderName);
        System.out.println("Account number : " + this.accountNumber);
    }
}
public class BankAccountTest {

    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for bank name
        System.out.print("Enter Bank name : ");
        BankAccount.bankName = input.nextLine();

        //creating a variable exit to indicate if a user want to exit or conntinue
        int exit = 1;

        //loop until user don't want to exit
        while(exit == 1) {

            System.out.println("\nCreating an account..... ");
            //taking user input for account holder name and account number
            System.out.print("Enter account holders name : ");
            String accountHolderName = input.nextLine();
            System.out.print("Enter accountNumber : ");
            long accountNumber = input.nextLong();

            //creating object of Bank account class
            BankAccount account = new BankAccount(accountHolderName, accountNumber);

            //showing total number of accounts created
            System.out.println("\nTotal number of accounts created are : " + BankAccount.getTotalAccounts());

            //checking whether the account object is object of BankAccount class or not
            if(account instanceof BankAccount) {
                //printing details
                account.display();
            }

            //asking user to continue or exit
            System.out.print("Enter 1 to open another account else press any number : ");
            exit = input.nextInt();
            input.nextLine();
        }
        //closing the input
        input.close();
    }
}
