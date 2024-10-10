package com.xworkz.project.runner;

import java.util.zip.DataFormatException;

import com.xworkz.project.test.DataFormatExceptions;

public class DataFormatExceptionRunner {

	public static void main(String[] args) throws DataFormatExceptions{
		 try {

	            String data = "123abc"; 
	            if (!data.matches("\\d+")) { 
	                throw new DataFormatException("Invalid data format: " + data);
	            }

	            System.out.println("Data is valid.");
	        } catch (DataFormatException e) {
	            System.out.println("DataFormatException caught: " + e.getMessage());
	        }

	        System.out.println("Execution continues...");

	}

}
