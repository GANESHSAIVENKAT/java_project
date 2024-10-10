package com.google.project.runner;
import com.google.project.task.Bank;
public class BankRunner {

	public static void main(String[] args) {
        // Example usage
        Bank bankAccount = new Bank();
        
        // Setting properties
        bankAccount.setAccountHolderName("Ganesh");
        bankAccount.setBankName("Andhra Bank");

        // Valid account number
        bankAccount.setBankAccountNumber("1234567890");

        // Invalid account number
        bankAccount.setBankAccountNumber("12345");

        // Valid Aadhar number
        bankAccount.setAadharCardNumber("123456789012");

        // Invalid Aadhar number
        bankAccount.setAadharCardNumber("12345678");

        // Updating bank balance and calculating interest
        bankAccount.updateBankBalance(300);

        bankAccount.updateBankBalance(700);

        bankAccount.updateBankBalance(15000);

        // Withdrawing money
        bankAccount.withdraw(1000);

        bankAccount.withdraw(15000);

	}

}
