

package com.xworkz.movieapplicatin.runner;

import java.util.Scanner;

import com.xworkz.movieapplicatin.dto.MovieBookingDto;
import com.xworkz.movieapplicatin.service.BookMyShowService;
import com.xworkz.movieapplicatin.service.BookMyShowServiceImplimentation;

public class MovieBookingRunner {
	public static void main(String[] args) {
		MovieBookingDto register=new MovieBookingDto();
		register.setUsername("Vishal");
		register.setPhone("925698536");
		register.setEmail("vishal224466@gmail.com");
		register.setPassword("vishal@5892");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize=scanner.nextInt();
		
		BookMyShowService show= new BookMyShowServiceImplimentation();
		show.setArraySize(arraySize);
		 String result=show.onSave(register);
		 String result1=show.onSave(register);
		 System.err.println(result);
		 System.err.println(result1);
		 show.read();
		 
		 
		 System.out.println("Updatefunction");
	        String updateResult = show.updateContactInfo(register, "12345678910", "vishal.123S@gmail.com");
	        System.out.println(updateResult);
	        show.read();
		 
		 
		 System.out.println("delete operation");
	        String deleteResult = show.onDelete("Vishal");
	        System.out.println(deleteResult);
	      
	        
	        
	        String bookingResult = show.bookTicket(register);
	        System.out.println(bookingResult); 
	        bookingResult = show.bookTicket(register); 
	        System.out.println(bookingResult);
	        
	        System.out.println("Available tickets: " + show.getAvailableTickets());
	        

	        scanner.close();
}
}