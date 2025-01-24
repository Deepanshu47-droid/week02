package hierarchicalinheritance.bankaccounttypes;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for Bank account
        System.out.println("\nFetching normal bank account details...");
        System.out.print("Enter account holder's name : ");
        String accountHolder = input.nextLine();
        System.out.print("Enter account number : ");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter balance : ");
        double balance = input.nextDouble();
        input.nextLine();

        //creating BankAccount class object
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);

        //printing details of bank account
        System.out.println("\nDetails of normal bank account.....");
        bankAccount.display();

        //taking user input for saving Bank account
        System.out.println("\nFetching saving bank account details...");
        System.out.print("Enter account holder's name : ");
        accountHolder = input.nextLine();
        System.out.print("Enter account number : ");
        accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter balance : ");
        balance = input.nextDouble();
        input.nextLine();
        System.out.print("Enter interest rate : ");
        double interestRate = input.nextDouble();
        input.nextLine();

        //creating SavingAccount class object
        SavingAccount savingAccount = new SavingAccount(accountHolder, accountNumber, balance, interestRate);

        //printing details of saving bank account
        System.out.println("\nDetails of saving bank account.....");
        savingAccount.display();

        //taking user input for Checking account
        System.out.println("\nFetching checking bank account details...");
        System.out.print("Enter account holder's name : ");
        accountHolder = input.nextLine();
        System.out.print("Enter account number : ");
        accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter balance : ");
        balance = input.nextDouble();
        input.nextLine();
        System.out.print("Enter withdraw limit : ");
        double withdrawLimit = input.nextDouble();
        input.nextLine();

        //creating CheckingAccount class object
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder, accountNumber, balance, withdrawLimit);

        //printing details of checking account
        System.out.println("\nDetails of checking account.....");
        checkingAccount.display();

        //taking user input for fixed deposit account
        System.out.println("\nFetching fixed deposit account details...");
        System.out.print("Enter account holder's name : ");
        accountHolder = input.nextLine();
        System.out.print("Enter account number : ");
        accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter balance : ");
        balance = input.nextDouble();
        input.nextLine();
        System.out.print("Enter fixed deposit amount : ");
        double FDamount = input.nextDouble();
        input.nextLine();

        //creating FixedDepositAccount class object
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(accountHolder, accountNumber, balance, withdrawLimit);

        //printing details of fixed deposit account
        System.out.println("\nDetails of fixed deposit account.....");
        fixedDepositAccount.display();

        //closing input object
        input.close();
    }
}
