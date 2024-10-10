package com.google.cardetails.testerrunner;

import com.google.cardetails.tester.*;

public class Carrunner {

	public static void main(String[] args) {

		Car detail = new Car();
		Car info = new Car();
		Car data = new Car();
		Car collection = new Car();
        
        // Invoke methods using subclass references
        System.out.println("Using SubClass reference:");
        detail.carbrand();
        detail.price();
        detail.colour();
        detail.rating();
        detail.buyer();
        
        // Upcasting: Create instances of SuperClass but point to SubClass objects
        Vehicle details = new Car();
        Vehicle information = new Car();
        Vehicle collections = new Car();
        Vehicle datacollect = new Car();
        
        // Invoke methods using upcasted references
        System.out.println("\nUsing upcasted SuperClass reference:");
        details.carbrand();
        details.price();
        details.colour();
        details.rating();
        details.buyer();
        
        checkType(detail);
        checkType(info);
        checkType(data);
        checkType(collection);
        
        checkType(details);
        checkType(information);
        checkType(collections);
        checkType(datacollect);
    }
    
    // Method to check whether an instance belongs to SuperClass type
    private static void checkType(Vehicle obj) {
        if (obj instanceof Car) {
            System.out.println(obj.getClass().getSimpleName() + " is an instance of Car.");
        } else {
            System.out.println(obj.getClass().getSimpleName() + " is not an instance of Car.");
        }
		
	}

}
