package com.xworkz.project.runner;

import com.xworkz.project.test.ArithmeticExceptions;

public class ArithmeticExceptionRunner {

	public static void main(String[] args) throws ArithmeticExceptions  {
		System.out.println("Main method running");
		try {
			
			int number = 10;
			int result = number/0;
			System.out.println("Result: "+result);
			
			
			
		} catch(ArithmeticException abc) {
			System.out.println("exception"+abc.getMessage());
			throw new ArithmeticExceptions("Error.. can't devided by zero");
		}
	}
	

}
