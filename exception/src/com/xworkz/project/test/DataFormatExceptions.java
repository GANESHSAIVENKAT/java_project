package com.xworkz.project.test;

public class DataFormatExceptions extends Exception {
    public DataFormatExceptions(String message) {
        super(message); 
        System.out.println("DataFormatException constructor is running");
    }
}