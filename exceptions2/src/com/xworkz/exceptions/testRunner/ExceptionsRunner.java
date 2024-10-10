package com.xworkz.exceptions.testRunner;

import java.io.IOException;

import com.xworkz.exceptions.test.Exceptions;

public class ExceptionsRunner {

	public static void main(String[] args) {
		try {
			Exceptions exc = new Exceptions();
			exc.processInput();
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("An error occurred: " + e.getMessage());
			System.out.println("Either invalid number format or array index is out of bounds.");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("An I/O error occurred: " + e.getMessage());
		}

	}

}
