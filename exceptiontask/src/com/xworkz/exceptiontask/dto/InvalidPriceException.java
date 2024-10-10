package com.xworkz.exceptiontask.dto;

public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}
