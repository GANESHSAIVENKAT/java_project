package com.google.voteridapplication.application;

public class Bank extends Object {
	public String bankName;
	public String location;
	public int employees;
	public Bank() {
		super();
		System.out.println("Defaultconstructor of Bank");
		
		
	}
	
	public Bank(String bankName,String location,int employees) {
		this.bankName=bankName;
		this.location=location;
		this.employees=employees;
	}
	

	public String toString() {
		return "Bank["+"BankName"+this.bankName+","+"Location"+this.location+","+"Employees"+this.employees+"]";
	}

}
