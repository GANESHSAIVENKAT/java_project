package com.xworkz.project.test;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
	
   public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void fuelType() {
        System.out.println("Car runs on gasoline.");
    }
}

