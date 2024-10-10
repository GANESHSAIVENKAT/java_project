package com.xworkz.javatest.test;

public class Exception_15 {

	public void divide(int numerator, int denominator) throws ArithmeticException {
        // Perform division and throw exception if denominator is zero
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
    	Exception_15 demo = new Exception_15();
        
        try {
            demo.divide(10, 0); // This will cause an ArithmeticException
        } catch (ArithmeticException exc) {
            System.out.println("Caught an exception: " + exc.getMessage());
            
            throw exc; 
        }
    }
}
