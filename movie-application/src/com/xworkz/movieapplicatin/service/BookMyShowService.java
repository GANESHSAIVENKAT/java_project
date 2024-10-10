package com.xworkz.movieapplicatin.service;

import com.xworkz.movieapplicatin.dto.MovieBookingDto;

public interface BookMyShowService {
	boolean setArraySize(int arraySize);
	String onSave(MovieBookingDto movieBookingDto);
	void read();
	 String updateContactInfo(MovieBookingDto movieBookingDto, String newPhone, String newEmail);
	String onDelete(String username);
	int getAvailableTickets();
	String bookTicket(MovieBookingDto movieBookingDto);

}
