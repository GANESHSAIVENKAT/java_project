package com.xworkz.test;

import java.util.Scanner;

public class Problem {

		
		public static void main(String[] args) {
			boolean number=true;
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the input:");
			String input=scanner.nextLine();
			char[] ch= input.toCharArray();
			for(char c:ch) {
				if(Character.isDigit(c)) { 
					number=true;
				}

			}if(number)
				System.out.println("user input contains number");
			else
				System.out.println("user input not contains number");

	}
}
