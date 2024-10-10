package com.xworkz.project.service;

import com.xworkz.project.test.Device;

public class SmartPhone implements Device {
    @Override
    public void powerOn() {
        System.out.println("Smartphone powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone powered off.");
    }

    @Override
    public void reset() {
        System.out.println("Smartphone is resetting.");
    }  
}

