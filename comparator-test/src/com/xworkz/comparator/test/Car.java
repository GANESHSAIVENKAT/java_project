package com.xworkz.comparator.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Comparable<Car>{

	String brand;
	String model;
	@Override
	public int compareTo(Car o) {
		System.out.println("Compare to method is running");
		return o.getBrand().compareToIgnoreCase(this.getBrand()) ;
	}
	
	
}
