package com.google.project.runner;

import com.google.project.tester.Animal;
import com.google.project.tester.Dog;

public class Animalrunner {

	public static void main(String[] args) {
        // Upcasting: Dog type object is being referred by a reference of type Animal
        Animal myAnimal = new Dog();

        // Since the reference type is Animal, it will call the overridden method in Dog class
        myAnimal.sound();  // Output: Dog barks

        // Downcasting: Casting the Animal reference back to Dog type
        Dog myDog = (Dog) myAnimal;

        // Now you can call methods specific to the Dog class
        myDog.fetch();  // Output: Dog fetches the ball
	}
}
