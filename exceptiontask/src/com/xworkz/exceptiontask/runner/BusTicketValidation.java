package com.xworkz.exceptiontask.runner;

import java.util.Scanner;

import com.xworkz.exceptiontask.dto.BusTicketDTO;
import com.xworkz.exceptiontask.dto.InvalidDestinationException;
import com.xworkz.exceptiontask.dto.InvalidPriceException;

public class BusTicketValidation {

	public static void main(String[] args) {
	   
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.print("Enter destination: ");
	            String destination = scanner.nextLine();

	            System.out.print("Enter price: ");
	            String priceInput = scanner.nextLine();

	            if (destination == null || priceInput == null || destination.trim().isEmpty() || priceInput.trim().isEmpty()) {
	                throw new IllegalArgumentException("Input cannot be null or empty");
	            }

	            double price = Double.parseDouble(priceInput);

	            BusTicketDTO ticket = new BusTicketDTO(destination, price);
	            validateTicket(ticket);
	            System.out.println("Bus ticket created successfully!");
	        } catch (InvalidDestinationException | InvalidPriceException e) {
	            System.err.println(e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.err.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("Validation process completed.");
	        }
	    }

	    private static void validateTicket(BusTicketDTO ticket) throws InvalidDestinationException, InvalidPriceException {
	        String destination = ticket.getDestination();
	        double price = ticket.getPrice();

	        if (destination.length() < 3 || destination.length() > 50) {
	            throw new InvalidDestinationException("Destination length must be between 3 and 50 characters.");
	        }
	        if (price <= 0) {
	            throw new InvalidPriceException("Price must be greater than zero.");
	        }
	    }
}
