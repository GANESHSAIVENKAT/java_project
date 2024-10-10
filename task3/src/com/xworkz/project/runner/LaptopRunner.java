package com.xworkz.project.runner;

import com.xworkz.project.service.MyLaptop;
import com.xworkz.project.test.Laptop;

public class LaptopRunner {
	public static void main(String[] args) {
		MyLaptop myLaptop = new MyLaptop();

		myLaptop.start();
		myLaptop.connectToWifi();
		myLaptop.openBrowser();
		myLaptop.shutDown();

		System.out.println("Laptop Brand: " + Laptop.getBrand());
		System.out.println("Battery Capacity: " + Laptop.getBatteryCapacity() + "%");
	}
}
