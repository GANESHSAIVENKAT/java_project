package com.xworkz.project.test;

public class NamingExceptions extends Exception {
    public NamingExceptions(String message) {
        super(message); 
        System.out.println("NamingException constructor is running");
    }
}
