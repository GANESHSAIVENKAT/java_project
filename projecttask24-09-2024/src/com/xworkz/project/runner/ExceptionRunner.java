package com.xworkz.project.runner;

public class ExceptionRunner {

	public static void main(String[] args) throws Exception{
	System.out.println("Main method is running");
	String userName="ganesh";
	if(userName.length()<=7) {
		throw new Exception(userName);
	}
	

		

	}

}
