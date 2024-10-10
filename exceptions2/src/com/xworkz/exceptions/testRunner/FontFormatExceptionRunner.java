package com.xworkz.exceptions.testRunner;
import com.xworkz.exceptions.test.FontFormatException;

public class FontFormatExceptionRunner {

	public static void main(String[] args) throws FontFormatException{
        try {
            String fontName = "Ganesh";

            if (fontName.equals("Ganesh")) {
                throw new FontFormatException("The font format is invalid: " + fontName);
            }
            System.out.println("Font is valid.");         
        } catch (FontFormatException e) {
            System.out.println("FontFormatExceptions caught: " + e.getMessage());
            e.fillInStackTrace();
        } finally { 
            System.out.println("Execution continues...");
        }

	}

}
