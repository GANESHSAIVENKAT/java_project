package com.xworkz.exceptions.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {

	 public void processInput() throws NumberFormatException, ArrayIndexOutOfBoundsException, IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("Enter a number:");
	        int number = Integer.parseInt(reader.readLine());

	        
	        int[] numbersArray = {10, 20, 30};
	        System.out.println("Accessing an array element:");
	        System.out.println("Element at index 5: " + numbersArray[4]);  
	    }
}
