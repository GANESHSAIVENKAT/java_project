package com.google.array.testrunner;
import com.google.array.test.*;
public class VowelConsonantCounterRunner {

	public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'e', 'i', 'o', 'u', 'x', 'y', 'z'};
        
        // Get counts from VowelConsonantCounter
        int[] counts = VowelConsonantCounter.countVowelsAndConsonants(arr);
        
        // Print the results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[0]);
	}
}
