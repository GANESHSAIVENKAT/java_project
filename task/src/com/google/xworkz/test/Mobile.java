package com.google.xworkz.test;

public class Mobile {

    public void display() {
        System.out.println("Mobile display method");
    }
   
    public Mobile() {
        System.out.println("no-arg constructor");
    }

    public Mobile(String brand) {
        System.out.println("brand " + brand);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString() {
        return "Mobile class instance";
    }
}
