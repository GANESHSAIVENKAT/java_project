package com.xworkz.comparator.test;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Vehicle implements Comparable<Vehicle>{
	

		String brand;
		String model;
		int topSpeed;

		@Override
		public int compareTo(Vehicle o) {
			System.out.println("Compare to method is running");
			return Integer.compare(this.topSpeed, o.topSpeed);
		}
		
		
	
}
