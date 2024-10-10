package com.xworkz.railwayp.repo;

import com.xworkz.railwayp.dto.RailwayDto;

public class RailwayTicketBookingRepoInplimentation implements RailwayTicketBookingRepo {

	RailwayDto listofbooking[];
	int index = 0;

	@Override
	public boolean setArraySize(int arraySize) {
		listofbooking = new RailwayDto[arraySize];
		if (listofbooking.length == arraySize) {
			System.out.println("Array is given");
		} else {
			System.out.println("Array is not given");
		}
		return false;

	}

	@Override
	public boolean onsave(RailwayDto bookingdto) {
		System.out.println("on save is running");
		if (listofbooking != null) {
			if (this.index < this.listofbooking.length) {
				listofbooking[index] = bookingdto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public RailwayDto[] read() {

		return listofbooking;
	}

	@Override
	public boolean onUpdate(RailwayDto bookingdto, String stationName, int trainNumber) {
		for (int i = 0; i < listofbooking.length; i++) {
			if (listofbooking[i] != null && listofbooking[i].equals(bookingdto)) {
				listofbooking[i] = bookingdto;
				bookingdto.setStationName(stationName);
				bookingdto.setTrainNumber(trainNumber);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deleteData(String platformNumber) {
		for (int i = 0; i < listofbooking.length; i++) {
			if (listofbooking[i] != null && listofbooking[i].getPlatformNumber().equals(platformNumber)) {
				for (int j = i; j < listofbooking.length - 1; j++) {
					listofbooking[j] = listofbooking[j + 1];
				}
				listofbooking[listofbooking.length - 1] = null;
				index--;
				return true;
			}
		}
		return false;
	}

}
