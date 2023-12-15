package com.cbfacademy.accounts;

public class Account {
    // Instance variables
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods to get Balance
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Deposit method
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // Withdraw method
    public double withdraw(double requested) {
        if (requested > 0 && requested <= balance) {
            balance -= requested;
            return requested;
        } else {
            return 0; // Insufficient balance
        }
    }
    // toString method
    @Override
    public String toString() {
      return "Account no: " + accountNumber + ", Balance: £" + String.format("%.2f", balance);
}
}
