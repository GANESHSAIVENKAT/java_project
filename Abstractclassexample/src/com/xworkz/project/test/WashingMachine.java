package com.xworkz.project.test;

public class WashingMachine extends Appliance {
    @Override
   public void turnOn() {
        System.out.println("Washing Machine is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing Machine is turning off.");
    }

    @Override
    public void repair() {
        System.out.println("Washing Machine needs repair.");
    }

	
}
