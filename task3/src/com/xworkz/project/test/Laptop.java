package com.xworkz.project.test;

public interface Laptop {

	void start();

	void shutDown();

	static String getBrand() {
		return "Generic Brand";
	}

	static int getBatteryCapacity() {
		return 50;
	}

	default void connectToWifi() {
		System.out.println("Connecting to WiFi");
	}

	default void openBrowser() {
		System.out.println("Opening the browser.");
	}
}
