package com.xworkz.project.runner;

import com.xworkz.project.test.Appliance;
import com.xworkz.project.test.WashingMachine;

public class ApplianceRunner {

	public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        washingMachine.turnOn();
        washingMachine.turnOff();
        washingMachine.repair();
	}
}
