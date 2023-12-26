package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    // Additional instance variable
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Getter and setter for overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to consider overdraft limit
    @Override
    public double withdraw(double requested) {
        double availableFunds = balance + overdraftLimit;
    if (requested <= availableFunds) {
        balance -= requested;
        return requested;
    } else {
       return super.withdraw(requested);// Insufficient funds within overdraft limit
    }
}

    // Override toString method for better representation
    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}