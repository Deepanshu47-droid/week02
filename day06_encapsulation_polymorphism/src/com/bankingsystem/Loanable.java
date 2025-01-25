package com.bankingsystem;

interface Loanable {

    //method to apply for loan to be implemented in derived class
    void applyForLoan(double amount);

    //method to calculate loan eligibility to be implemented in derived class
    boolean calculateLoanEligibility();
}