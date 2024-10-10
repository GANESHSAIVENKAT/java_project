package com.xworkz.project.runner;



public class ArrayLengthExceptionRunner {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		System.out.println("Main method is running");

		int[] numbers = new int[15];

		if (numbers.length > 10) {
			throw new ArrayIndexOutOfBoundsException("Array length exceeds the maximum allowed size of 10.");
		}

		System.out.println("Array length is valid.");
	}
}
