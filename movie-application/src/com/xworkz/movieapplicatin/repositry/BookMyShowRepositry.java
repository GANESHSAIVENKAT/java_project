package com.xworkz.movieapplicatin.repositry;

import com.xworkz.movieapplicatin.dto.MovieBookingDto;

public interface BookMyShowRepositry {
	boolean setArraySize(int arraySize);
	boolean onSaveData(MovieBookingDto movieBookingDto);
	boolean duplicateCheck(MovieBookingDto dto);
	 MovieBookingDto[] read();
	 boolean onUpdate(MovieBookingDto movieBookingDto, String newPhone, String newEmail);
	 boolean deleteData(String username);
	 int getAvailableTickets();
	 boolean bookTicket(MovieBookingDto movieBookingDto);

}
