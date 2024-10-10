package com.xworkz.movieapplicatin.repositry;

import com.xworkz.movieapplicatin.dto.MovieBookingDto;

public class BookMyShowRepositryImplimentation implements BookMyShowRepositry {
	private MovieBookingDto[] listofarray;
	private int index = 0;
	 private int availableTickets;

	@Override
	public boolean setArraySize(int arraySize) {
		listofarray = new MovieBookingDto[arraySize];
		if (listofarray.length == arraySize) {
			 this.availableTickets = arraySize;
			System.out.println("Array is given");
		} else {
			System.out.println("Array is not given");
		}
		return false;
	}

	@Override
	public boolean onSaveData(MovieBookingDto movieBookingDto) {
		System.out.println("On Save is running");
		if (listofarray != null) {
			if (this.index < this.listofarray.length) {
				listofarray[index] = movieBookingDto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean duplicateCheck(MovieBookingDto dto) {
		if (listofarray != null) {
			for (int i = 0; i < listofarray.length; i++) {
				if(listofarray[i]!=null && listofarray[i].equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public MovieBookingDto[] read() {
		
		return listofarray;
	}

	@Override
	public boolean onUpdate(MovieBookingDto movieBookingDto, String newPhone, String newEmail) {
		for (int i = 0; i < listofarray.length; i++) {
			if(listofarray[i]!=null &&listofarray[i].equals(movieBookingDto)) {
				listofarray[i] = movieBookingDto;
				  movieBookingDto.setPhone(newPhone);
		            movieBookingDto.setEmail(newEmail);
				return true;
			}
		}
	
		return false;
	}

	@Override
	public boolean deleteData(String username) {
		for (int i = 0,j=0; i < listofarray.length; i++) {
			if(listofarray[i]!=null &&listofarray[i].getUsername().equals(username)) {
				listofarray[j++] =listofarray[i] ;
				
				return true;
			}
		}
	
		return false;
	}

	@Override
	public int getAvailableTickets() {
		
		return availableTickets;
	}

	@Override
	public boolean bookTicket(MovieBookingDto movieBookingDto) {
        if (availableTickets > 0) {
            listofarray[index] = movieBookingDto;
            index++;
            availableTickets--;
            return true;
        }
		return false;
	}

	
}
