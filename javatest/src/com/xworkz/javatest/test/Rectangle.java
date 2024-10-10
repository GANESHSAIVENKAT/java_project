package com.xworkz.javatest.test;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rectangle extends Shape {
	private double length;
    private double width;
	@Override
	public void calculateArea() {
		 double area = length * width;
	      System.out.println("Area of Rectangle: " + area);

	}

}
