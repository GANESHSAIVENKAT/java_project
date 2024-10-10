package com.xworkz.project.service;

import com.xworkz.project.test.Appliance;

public class WashingMachine implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now on.");
    }
    @Override
    public void turnOff() {
        System.out.println("Washing machine is now off.");
    }
    @Override
    public void displayStatus() {
        System.out.println("Washing machine is functioning properly.");
    }
}
