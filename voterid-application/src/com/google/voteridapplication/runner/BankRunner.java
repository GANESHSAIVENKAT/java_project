package com.google.voteridapplication.runner;
import com.google.voteridapplication.application.Bank;
public class BankRunner {

	public static void main(String[] args) {
	

	Bank bank=new Bank("SBI","Balajinagar",50);
	System.out.println(bank.toString());

	}

}
