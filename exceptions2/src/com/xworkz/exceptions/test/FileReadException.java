package com.xworkz.exceptions.test;


public class FileReadException extends Throwable {
    public FileReadException(String message) {
        super(message);
        System.out.println("Exception message: " + message);
    }
}

