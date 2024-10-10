package com.xworkz.projectc.test;

public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private Transmission transmission;

    public Car(Engine engine, Wheel[] wheels, Transmission transmission) {
        this.engine = engine;
        this.wheels = wheels;
        this.transmission = transmission;
    }

    // Getters and Setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
