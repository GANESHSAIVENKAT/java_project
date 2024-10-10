package com.xworkz.project.runner;

public class NullCheckExceptionRunner {

	public static void main(String[] args) throws NullPointerException{
		System.out.println("main method running");
		String userName=null;
		 if (userName == null) {
		
	         throw new NullPointerException(userName);
	     }
	}
}
