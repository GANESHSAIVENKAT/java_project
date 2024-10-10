package com.xworkz.test.tester;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ArrayReplacement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter choice");
		int choice=scanner.nextInt();
		
		switch(choice) {
		
		case 1:
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
	

		
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();

		
		for (int i = 0; i < size; i++) {
			if (array[i] % num == 0) {
				array[i] = num;
			}
		}

		
		System.out.println("Modified array: ");
		for (int value : array) {
			System.out.print(value + " ");
		}
		break;
		case 2:
		Month currentmonth = LocalDate.now().getMonth();
		System.out.println("Currentmonth" + currentmonth);
		break;
		case 3:
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		System.out.println("dayOfWeek" + dayOfWeek);
		break;
		case 4:
			DayOfWeek day = LocalDate.now().getDayOfWeek();
		System.out.println("Checking dayname");
		scanner.nextLine();
		String dayname = scanner.nextLine();
		if (day.name().equals(dayname)) {
			System.out.println("entered day is match::" + dayname);
		} else {
			System.out.println("entered day is not match");
		}
		break;
		
		
		}
	}
}
	
