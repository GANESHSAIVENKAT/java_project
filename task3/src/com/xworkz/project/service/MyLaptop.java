package com.xworkz.project.service;

import com.xworkz.project.test.Laptop;

public class MyLaptop implements Laptop {
	@Override
	public void start() {
		System.out.println("Laptop is starting");
	}

	@Override
	public void shutDown() {
		System.out.println("Laptop is shutting down");
	}

	@Override
	public void connectToWifi() {
		System.out.println("Connecting to WiFi with custom settings");
	}

}
