package com.xworkz.project.test;

public class ArithmeticExceptions extends Throwable{

	public ArithmeticExceptions(String message) {
		super(message);
		System.out.println("ArithmeticException constructor is running");
	}

}

