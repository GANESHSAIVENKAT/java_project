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
public class Circle extends Shape{
	 private double radius;
	@Override
	
	public void calculateArea() {
		double area=3.14*radius*radius;
		System.out.println("Circle radius"+area);
	}

}
