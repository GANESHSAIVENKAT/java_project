package com.xworkz.movieapplicatin.service;

import com.xworkz.movieapplicatin.dto.MovieBookingDto;
import com.xworkz.movieapplicatin.repositry.BookMyShowRepositry;
import com.xworkz.movieapplicatin.repositry.BookMyShowRepositryImplimentation;

public class BookMyShowServiceImplimentation implements BookMyShowService {
	BookMyShowRepositry repo = new BookMyShowRepositryImplimentation();

	@Override
	public boolean setArraySize(int arraySize) {

		if (arraySize > 0) {
			System.out.println("Array is taken");
			repo.setArraySize(arraySize);
			return true;
		} else {
			System.out.println("Array is not taken");
		}
		return false;
	}

	@Override
	public String onSave(MovieBookingDto movieBookingDto) {
		System.out.println("onSave service is running");
		if (movieBookingDto != null) {
			if (!repo.duplicateCheck(movieBookingDto)) {
				repo.onSaveData(movieBookingDto);
				return "Saved..";
			}
		}
		return "Not saved..";
	}

	@Override
	public void read() {
		MovieBookingDto[] booking = repo.read();
		for (MovieBookingDto movieBookingDto : booking) {
			System.out.println("Booking" + movieBookingDto);

		}

	}

	@Override
	public String updateContactInfo(MovieBookingDto movieBookingDto, String newPhone, String newEmail) {
		if (movieBookingDto != null) {
          
			if (repo.onUpdate(movieBookingDto, newPhone, newEmail)) {
				
				return "Updated Successfully";
			}
		}
		return "Not Updated";
	}

	
	@Override
	public String onDelete(String username) {
	    if (username != null) {
	        if (repo.deleteData(username)) {
	            return "Deleted successfully";
	        }
	    }
	    return "Deletion failed";
	}

	@Override
	public int getAvailableTickets() {
	     return repo.getAvailableTickets();
		
	}

	@Override
	public String bookTicket(MovieBookingDto movieBookingDto) {
        if (repo.bookTicket(movieBookingDto)) {
            return "Ticket booked successfully! Remaining tickets: " + getAvailableTickets();
        }
        return "No tickets available for booking.";
	}
}
