package com.xworkz.project.runner;

import com.xworkz.project.test.Animal;
import com.xworkz.project.test.Dog;

public class AnimalRunner {

	public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        dog.sleep();

	}

}
