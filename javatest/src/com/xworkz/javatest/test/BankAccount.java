package com.xworkz.javatest.test;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient funds. ");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance:" + balance);
        }
    }
}
