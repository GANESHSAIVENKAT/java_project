package com.xworkz.project.runner;

import com.xworkz.project.service.Car;
import com.xworkz.project.test.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
//		static
		System.out.println("FuelType"+Vehicle.getFuelType());	
		System.out.println("NumberOfWheels"+Vehicle.getNumberOfWheels());

		Vehicle detail=new Car();
		detail.accelerate();
		detail.honk();
		detail.startEngine();
		detail.stopEngine();
		
	}

}
