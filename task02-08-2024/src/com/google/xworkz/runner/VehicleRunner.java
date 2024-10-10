package com.google.xworkz.runner;

import com.google.xworkz.target.Vehicle;

import java.util.Date;

import com.google.xworkz.target.Bike;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Bike bike = new Bike();
		vehicle.brand = "Hero";
		vehicle.year = 2018;
		vehicle.colour = "Blue";
	
		bike.brand="Hero";
		bike.year=2018;
		bike.colour = "Blue";
		bike.date = new Date();
		System.out.println("Brand Name: " +vehicle.brand);  
		System.out.println("Year Avaliable: " + vehicle.year);  
		  
		System.out.println("Bike colour: " + vehicle.colour);  
		System.out.println("Brand Name: " + bike.brand);  
		System.out.println("Year Avaliable: " + bike.year);
		System.out.println("Bike colour: " + bike.colour);  
		System.out.println("Purchased Date: " + bike.date);

	}

}
