package com.google.xworkz.runner;
import com.google.xworkz.target.Animal;
import com.google.xworkz.target.Buffalo;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Buffalo buffalo = new Buffalo();
		animal.name = "Bessie";
		animal.height = 5.0f;
		animal.habitat = "Farm";
		animal.weight = 20;
		buffalo.habitat="Farm";
		buffalo.milkProduction = 25.5;
		buffalo.coatColor = "Black and White";
		System.out.println("Name: " +animal.name);  
		System.out.println("Age: " + animal.height);  
		System.out.println("Weight: " + animal.weight);  
		System.out.println("Habitat: " + animal.habitat);  
		System.out.println("Habitat: " + buffalo.habitat);    
		System.out.println("Milk Production: " + buffalo.milkProduction);  
		System.out.println("Coat Color: " + buffalo.coatColor);
		
		
		
		System.out.println(buffalo.details("Bessie",5.0f,20.0,"Farm"));

		
	}
	
}
