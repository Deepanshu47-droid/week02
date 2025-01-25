package com.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest
    private boolean loanEligible;

    // Constructor to initialize values
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        loanEligible = balance > 10000; // Eligibility based on balance
    }

    //implementation of calculateInterest() method
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    //implementation of applyForLoan() method
    @Override
    public void applyForLoan(double amount) {
        if (loanEligible) {
            System.out.println("Loan of " + amount + " approved for Current Account holder: " + getHolderName());
        } else {
            System.out.println("Loan application denied. Insufficient balance for eligibility.");
        }
    }

    //implementation of calculateLoanEligibility() method
    @Override
    public boolean calculateLoanEligibility() {
        return loanEligible;
    }
}