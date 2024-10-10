package com.xworkz.project.test;

public class IllegalArgument extends Throwable{

	public IllegalArgument(String message) {
		super(message);
		System.out.println("ArithmeticException constructor is running");
	}

}