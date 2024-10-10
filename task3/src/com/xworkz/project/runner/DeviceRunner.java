package com.xworkz.project.runner;

import com.xworkz.project.service.SmartPhone;
import com.xworkz.project.test.Device;

public class DeviceRunner {
    public static void main(String[] args) {
      
        SmartPhone mySmartphone = new SmartPhone();
        
        mySmartphone.powerOn();
        mySmartphone.reset(); 
        mySmartphone.updateFirmware(); 
        mySmartphone.powerOff();

        System.out.println("Device Manufacturer: " + Device.getManufacturer());
        System.out.println("Max Warranty Years: " + Device.getMaxWarrantyYears());
    }
}
