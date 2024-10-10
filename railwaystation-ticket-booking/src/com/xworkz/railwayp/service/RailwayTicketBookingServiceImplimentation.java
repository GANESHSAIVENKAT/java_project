package com.xworkz.railwayp.service;

import com.xworkz.railwayp.dto.RailwayDto;
import com.xworkz.railwayp.repo.RailwayTicketBookingRepo;
import com.xworkz.railwayp.repo.RailwayTicketBookingRepoInplimentation;

public class RailwayTicketBookingServiceImplimentation implements RailwayTicketBookingService {

	RailwayTicketBookingRepo repo=new RailwayTicketBookingRepoInplimentation();
	@Override
	public boolean setArraySize(int arraySize) {
		if(arraySize>0) {
			System.out.println("Array is Taken");
			repo.setArraySize(arraySize);
			return true;
			
		}else {
			System.out.println("Array is Not Taken");
		}
		return false;
	}

	@Override
	public String onSave(RailwayDto bookingdto) {
		System.out.println("onSave is running in service");
		if(bookingdto!=null) {
			repo.onsave(bookingdto);
			return "saved...";
		}
		return "Not saved...";
	}

	@Override
	public void read() {
		RailwayDto[] bookingdto=repo.read();
		for (RailwayDto railwayDto : bookingdto) {
			System.out.println("details"+railwayDto);
		}
		
	}

	@Override
	public String Updatebydetails(RailwayDto bookingdto, String stationName, int trainNumber) {
		if (bookingdto != null) {
	          
			if (repo.onUpdate(bookingdto, stationName, trainNumber)){
				
				return "Updated Successfully";
			}
		}
		return "Not Updated";
	}

	@Override
	public String deletebyplatformNumber(String platformNumber) {
	    if (platformNumber != null) {
	        if(repo.deleteData(platformNumber)) {
	            return "Deleted successfully";
	        }
	    }
	    return "Deletion failed";
	}


}
