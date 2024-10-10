package com.xworkz.javatest.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//14
public class FileReadDemo {

	 public void readFile(String filePath) throws IOException {
	        BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader(filePath));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            
	            throw new IOException("Error reading the file: " + e.getMessage());
	        } finally {
	           
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    System.out.println("Error closing the file reader: " + e.getMessage());
	                }
	            }
	        }
	  }

	    public static void main(String[] args) {
	        FileReadDemo demo = new FileReadDemo();
	        String filePath = "example.txt"; 

	        try {
	            demo.readFile(filePath);
	        } catch (IOException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }
}
