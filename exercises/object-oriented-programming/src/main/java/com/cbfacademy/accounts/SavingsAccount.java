package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    // Additional instance variable
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Getter and setter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0){
        this.interestRate = interestRate;
        }
    }
  
    // Method to apply interest
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
    // Online
    // Override toString method for better representation
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                ", interestRate=" + interestRate +
                '}';
    }
}