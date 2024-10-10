// 2. Runner class for handling font format exceptions
package com.xworkz.project.runner;

import com.xworkz.project.test.FontFormatExceptions;

public class FontFormatExceptionRunner {

    public static void main(String[] args) {
        try {
            String fontName = "InvalidFontName";
            
            // Simulate a font format check
            if (fontName.equals("InvalidFontName")) {
                throw new FontFormatExceptions("The font format is invalid: " + fontName);
            }

            System.out.println("Font is valid.");
            
        } catch (FontFormatExceptions e) {
            System.out.println("FontFormatExceptions caught: " + e.getMessage());
        } finally {
            // This block will execute regardless of whether an exception was thrown
            System.out.println("Execution continues...");
        }
    }
}
