package com.xworkz.programming.runner;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String input = "GaneshSaiVenkat";

       
        char[] charArray = input.toCharArray();

      
        boolean[] counted = new boolean[charArray.length];

      
        boolean hasDuplicates = false;

       
        for (int i = 0; i < charArray.length; i++) {
            if (counted[i]) {
                continue; 
            }

            char currentChar = Character.toLowerCase(charArray[i]);
            int count = 1; 

         
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) == currentChar) {
                    count++;
                    counted[j] = true; 
                }
            }

           
            if (count > 1) {
                System.out.println("Duplicate character: " + charArray[i] + " appears " + count + " times.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}
