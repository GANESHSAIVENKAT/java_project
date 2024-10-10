package com.google.cardetails.tester;

public class Car extends Vehicle{

    @Override
    public void carbrand() {
        System.out.println("Tata");
    }

    @Override
    public void price() {
        System.out.println("150000");
    }

    @Override
    public void colour() {
        System.out.println("Blue");
    }

    @Override
    public void rating() {
        System.out.println("4");
    }

    @Override
    public void buyer() {
        System.out.println("Ganesh");
    }
}
