package com.google.xworkz.test;

public class Phone extends Mobile{
    @Override
    public void display() {
        System.out.println("Phone display method");
    }

  
    public Phone() {
        super(); 
        System.out.println("no arg constructor");
    }

    public Phone(String brand) {
        super(brand);
        System.out.println("brand " + brand);
    }

    
 
    public Phone(String brand, int price) {
        this(brand); 
        System.out.println( brand + " " + price);
    }

   
    public Phone brand(String brand) {
        System.out.println("brand: " + brand);
        return this; 
    }

    public Phone setNumber(int price) {
        System.out.println("price : " + price);
        return this;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        return true;
    }

    @Override
    public String toString() {
        return "Phone class instance";
    }

}
