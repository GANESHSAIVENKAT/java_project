package com.google.tester.taskrunner;
import com.google.tester.task.*;
public class AnimalRunner {

	public static void main(String[] args) {

        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();
        myAnimal1.makeSound(); 
        
        
        myAnimal2.makeSound(); 
	}

}
