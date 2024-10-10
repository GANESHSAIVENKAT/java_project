package com.google.project.task;

public class Bank {
	 private String bankName;
	    private String accountHolderName;
	    private String bankAccountNumber;
	    private String aadharCardNumber;
	    private double bankBalance;

	    // Getter and Setter methods for encapsulation
	    public String getBankName() {
	        return bankName;
	    }

	    public void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	    public String getBankAccountNumber() {
	        return bankAccountNumber;
	    }

	    public void setBankAccountNumber(String bankAccountNumber) {
	        if (bankAccountNumber.length() == 10) {
	            this.bankAccountNumber = bankAccountNumber;
	            System.out.println("Account Holder: " + accountHolderName + ", Bank Name: " + bankName);
	        } else {
	            System.out.println("Invalid Bank Account Number. It must contain exactly 10 digits.");
	        }
	    }

	    public String getAadharCardNumber() {
	        return aadharCardNumber;
	    }

	    public void setAadharCardNumber(String aadharCardNumber) {
	        if (aadharCardNumber.length() == 12) {
	            this.aadharCardNumber = aadharCardNumber;
				System.out.println(aadharCardNumber);
	        } else {
	            System.out.println("Invalid Aadhar Card Number. It must contain exactly 12 digits.");
	        }
	    }

	    public double getBankBalance() {
	        return bankBalance;
	    }

	    public void setBankBalance(double bankBalance) {
	        this.bankBalance = bankBalance;
	    }

	    // Method to accept bank balance and perform interest calculation
	    public void updateBankBalance(double bankBalance) {
	        this.bankBalance = bankBalance;

	        if (bankBalance < 500) {
	            System.out.println("Please maintain the bank balance.");
	        } else if (bankBalance >= 500 && bankBalance < 10000) {
	            this.bankBalance += bankBalance * 0.10;
	            System.out.println("Total account balance after adding 10% interest: " + this.bankBalance);
	        } else if (bankBalance >= 10000 && bankBalance < 50000) {
	            this.bankBalance += bankBalance * 0.20;
	            System.out.println("Total account balance after adding 20% interest: " + this.bankBalance);
	        } else {
	            System.out.println("Total account balance: " + this.bankBalance);
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (bankBalance < amount) {
	            System.out.println("Account balance is low, you can't withdraw amount.");
	        } else {
	            bankBalance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: " + bankBalance);
	        }
	    }
}
