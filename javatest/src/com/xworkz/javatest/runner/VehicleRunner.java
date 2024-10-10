package com.xworkz.javatest.runner;

import com.xworkz.javatest.test.Bike;
import com.xworkz.javatest.test.Car;
import com.xworkz.javatest.test.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {	
		Vehicle v = new Vehicle();
		v.start();
		
		  Vehicle myCar = new Car();
	        myCar.start();  

	        Vehicle myBike = new Bike();
	        myBike.start(); 
	}

}
