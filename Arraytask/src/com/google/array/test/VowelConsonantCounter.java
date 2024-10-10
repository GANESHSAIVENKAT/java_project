package com.google.array.test;

public class VowelConsonantCounter {

    public static int[] countVowelsAndConsonants(char[] arr) {
        // Define the vowels
        String vowels = "aeiou";
        
        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Iterate through the array
        for (char c : arr) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            } else if (Character.isLetter(c)) {
                consonantCount++;
            }
        }
        
        // Return the counts as an array
        return new int[] {vowelCount, consonantCount};
    }
}
