package com.xworkz.projectc.testrunner;
import com.xworkz.projectc.test.*;
public class CarRunner {

	public static void main(String[] args) {

        Engine engine = new Engine("V8", 400, false);
        Wheel[] wheels = {
            new Wheel("Rubber", 17, true),
            new Wheel("Rubber", 17, true),
            new Wheel("Rubber", 17, true),
            new Wheel("Rubber", 17, true)
        };
        Transmission transmission = new Transmission("Automatic", 6, true);

        // Create a Car instance
        Car car = new Car(engine, wheels, transmission);

        // Create an Owner instance
        Owner owner = new Owner("John Doe", 35, car);

        // Display details
        System.out.println("Owner: " + owner.getName());
        System.out.println("Car Engine Type: " + owner.getCar().getEngine().getType());
        System.out.println("Number of Wheels: " + owner.getCar().getWheels().length);
        System.out.println("Transmission Type: " + owner.getCar().getTransmission().getType());
	}

}
