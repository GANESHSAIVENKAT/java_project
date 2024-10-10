package com.xworkz.project.test;

public interface Device {
    void powerOn();
    void powerOff();
    static String getManufacturer() {
        return "Generic Manufacturer"; 
    } 
    static int getMaxWarrantyYears() {
        return 5; 
    }
    default void reset() {
        System.out.println("Resetting device.");
    }
    
    default void updateFirmware() {
        System.out.println("Updating firmware.");
    }
}
