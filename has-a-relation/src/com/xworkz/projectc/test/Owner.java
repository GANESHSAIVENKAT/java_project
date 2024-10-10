package com.xworkz.projectc.test;

public class Owner {

    private String name;
    private int age;
    private Car car;

    public Owner(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
