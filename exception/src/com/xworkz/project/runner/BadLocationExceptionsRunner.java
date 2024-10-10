package com.xworkz.project.runner;



import javax.swing.text.BadLocationException;

import com.xworkz.project.test.BadLocationExceptions;

public class BadLocationExceptionsRunner {


	public static void main(String[] args) throws BadLocationExceptions  {
	      String validLocation = "Xworkz";
	        String inputLocation = "xworkz"; 
		 
	    try {
          
            if (inputLocation.equalsIgnoreCase(validLocation)) {
                throw new BadLocationExceptions("Location is already bound: " + inputLocation);
            } else {
                System.out.println("Location is valid.");
            }
        } catch (BadLocationExceptions e) {
            System.out.println("BadLocationException caught: " + e.getMessage());
        }

        System.out.println("Execution continues...");
        
        try {
          
            throw new BadLocationExceptions("Another bad location attempt: " + inputLocation);
        } catch (BadLocationExceptions e) {
            System.out.println("BadLocationException caught: " + e.getMessage());
            throw new BadLocationExceptions(inputLocation);
        }
		    }

}
