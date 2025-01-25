package com.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest
    private boolean loanEligible;

    // Constructor to initialize values
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        loanEligible = balance > 5000; // Eligibility based on balance
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
            System.out.println("Loan of " + amount + " approved for Savings Account holder: " + getHolderName());
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
