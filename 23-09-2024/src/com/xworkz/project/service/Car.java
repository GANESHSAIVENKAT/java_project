package com.xworkz.project.service;

public class Car {

	   private Engine engine;

	  
	    public Car() {
	        engine = new Engine();
	    }

	    public void startCar() {
	        engine.start();
	        System.out.println("Car started.");
	    }
}
