package com.xworkz.project.runner;

import com.xworkz.project.test.IllegalArgument;

public class IllegalArgumentRunner {

	public static void main(String[] args) throws IllegalArgument  {
		try {
            int checkAge =21 ;  
            if(checkAge<18) {
            	throw new IllegalArgumentException("age is must be 18 or older");
            }
            else {
            	throw new IllegalArgumentException("age is correct");
            }
       } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());

        }
		
		
        System.out.println("Program continues...");
        throw new IllegalArgumentException("hi ");
    }

	

}
