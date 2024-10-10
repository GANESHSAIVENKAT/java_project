package com.xworkz.exceptions.testRunner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.xworkz.exceptions.test.FileReadException;

public class FileReaderExceptionRunner {
	public static void main(String[] args) throws FileReadException {

		String fileName = "nonexistentfile.txt";

		try {
			readFile(fileName);
			
		} catch (FileNotFoundException e) {

			throw new FileReadException("Caught Exception: File not found. " + e.getMessage());
		} catch (IOException e) {
			 System.out.println("Caught Exception: IO error. " + e.getMessage());
			throw new FileReadException("Caught Exception: IO error. " + e.getMessage());
		} 

		System.out.println("Program continues...");
	}

	public static void readFile(String fileName) throws FileNotFoundException, IOException ,FileReadException{
		File file = new File(fileName);
		FileReader reader = new FileReader(file);

		throw new IOException("Simulated IO error occurred while reading the file.");
	}
}
