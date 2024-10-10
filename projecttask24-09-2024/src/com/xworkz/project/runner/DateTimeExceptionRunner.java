package com.xworkz.project.runner;

import java.time.DateTimeException;
import java.time.LocalDateTime;


public class DateTimeExceptionRunner {

	public static void main(String[] args) throws DateTimeException  {
		System.out.println("Main method is running");  
        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 12, 0); 

        if (dateTime.isBefore(LocalDateTime.now())) {
            throw new DateTimeException("The date and time cannot be in the past: " + dateTime);
        }

        System.out.println("The date and time is valid.");
    }
}