package com.xworkz.project.testrunner;

import com.xworkz.project.test.Animal;
import com.xworkz.project.test.Dog;

public class AnimalRunner {

	public static void main(String[] args) {
        Animal animal = new Dog(); 
        animal.sound(); 
        Dog dog=new Dog();
        dog.colour();
        Animal animal1=new Animal();
        animal1.sound();

	}

}
