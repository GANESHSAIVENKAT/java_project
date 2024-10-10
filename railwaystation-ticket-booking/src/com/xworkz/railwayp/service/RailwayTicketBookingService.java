package com.xworkz.railwayp.service;

import com.xworkz.railwayp.dto.RailwayDto;

public interface RailwayTicketBookingService {

	boolean setArraySize(int arraySize);
	String onSave(RailwayDto bookingdto);
	void read();
	 String Updatebydetails(RailwayDto bookingdto, String stationName, int trainNumber);
	 String deletebyplatformNumber(String platformNumber);
}
