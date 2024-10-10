package com.xworkz.project.test;

public interface Vehicle {
    
    void startEngine();
    void stopEngine();

   
    static int getNumberOfWheels() {
        return 4; 
    }
    
    static String getFuelType() {
        return "Gasoline"; 
    }

    
    default void honk() {
        System.out.println("Beep..");
    }
    
    default void accelerate() {
        System.out.println("Accelerating.");
    }
}

