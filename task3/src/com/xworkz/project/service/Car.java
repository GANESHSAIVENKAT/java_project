package com.xworkz.project.service;

import com.xworkz.project.test.Vehicle;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

  
    @Override
    public void honk() {
        System.out.println("Car horn: Beep");
    }

 
}
