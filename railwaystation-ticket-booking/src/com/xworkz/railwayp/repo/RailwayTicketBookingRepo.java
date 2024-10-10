package com.xworkz.railwayp.repo;

import com.xworkz.railwayp.dto.RailwayDto;

public interface RailwayTicketBookingRepo {

	boolean setArraySize(int arraySize);
	boolean onsave(RailwayDto bookingdto);
	RailwayDto[] read();
	 boolean onUpdate(RailwayDto bookingdto, String stationName, int trainNumber);
	 boolean deleteData(String platformNumber);
}
