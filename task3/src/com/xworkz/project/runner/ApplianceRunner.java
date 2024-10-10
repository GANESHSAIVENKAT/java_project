package com.xworkz.project.runner;

import com.xworkz.project.service.WashingMachine;
import com.xworkz.project.test.Appliance;

public class ApplianceRunner {
	public static void main(String[] args) {

		WashingMachine myWasher = new WashingMachine();

		myWasher.turnOn();
		myWasher.displayStatus();
		myWasher.performMaintenance();
		myWasher.turnOff();

		System.out.println("Power source: " + Appliance.getPowerSource());
		System.out.println("Warranty period: " + Appliance.getWarrantyPeriod() + " years");
	}
}
