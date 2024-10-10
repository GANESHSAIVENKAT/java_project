package com.xworkz.exceptions.testRunner;

import java.util.Scanner;

import com.xworkz.exceptions.test.CustomCheckedException;

public class CustomCheckedExceptionRunner {

	public static void main(String[] args) throws CustomCheckedException {
	       Scanner scanner = new Scanner(System.in);
	        int[] numbers = {1, 2, 3, 4, 5}; // Example array

	        try {
	            System.out.print("Enter an index to access the array (0-4): ");
	            String userInput = scanner.nextLine();
	            int index = Integer.parseInt(userInput); // May throw NumberFormatException

	            // Access the array
	            System.out.println("Value at index " + index + ": " + numbers[index]); // May throw ArrayIndexOutOfBoundsException

	        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
	            // Handle both exceptions in one catch block
	            System.out.println("Caught exception: " + e.getMessage());
	            if (e instanceof NumberFormatException) {
	                System.out.println("Please enter a valid number.");
	            } else if (e instanceof ArrayIndexOutOfBoundsException) {
	                System.out.println("Index is out of bounds. Please enter an index between 0 and 4.");
	            }
	        
	            scanner.close();
	        }


	}

}
