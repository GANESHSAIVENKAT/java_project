package com.xworkz.project.runner;

import com.xworkz.project.test.NagativeArrayIndex;

public class NagativeArrayIndexRunner {

	public static void main(String[] args) throws NagativeArrayIndex {
		try {
            getarrayleght(-5);
        } catch (NegativeArraySizeException e) {
           getArray();
        }
		
		throw new NagativeArrayIndex();

	}
	public static void getarrayleght(int number) {
		int[] array = new int[number];
        System.out.println("array size:"+number);
	}
	public static void getArray() {
		 System.out.println("Array size cannot be negative!");

	}

}
