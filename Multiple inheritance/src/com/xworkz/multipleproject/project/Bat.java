package com.xworkz.multipleproject.project;

public class Bat extends Animal implements Bird, Mammal {

	@Override
	public void sound() {
		 System.out.println("Bat is flying.");
		
	}

	@Override
	public void fly() {
		 System.out.println("Bat makes a screeching sound.");
		
	}

}
