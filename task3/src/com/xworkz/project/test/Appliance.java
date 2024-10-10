package com.xworkz.project.test;

public interface Appliance {
   
    void turnOn();
    void turnOff();
    
    static String getPowerSource() {
        return "Electric"; 
    }
    
    static int getWarrantyPeriod() {
        return 2; 
    }

    default void displayStatus() {
        System.out.println("Appliance is in good working condition.");
    }
    
    default void performMaintenance() {
        System.out.println("Performing maintenance tasks.");
    }
}
