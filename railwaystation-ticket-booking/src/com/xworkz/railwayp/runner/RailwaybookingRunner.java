package com.xworkz.railwayp.runner;

import java.util.Scanner;

import com.xworkz.railwayp.dto.PersondetailsDto;
import com.xworkz.railwayp.dto.RailwayDto;
import com.xworkz.railwayp.enums.Locationconstant;
import com.xworkz.railwayp.service.RailwayTicketBookingService;
import com.xworkz.railwayp.service.RailwayTicketBookingServiceImplimentation;

public class RailwaybookingRunner {

	public static void main(String[] args) {
		RailwayDto booking=new RailwayDto();
		PersondetailsDto details=new PersondetailsDto();
		
		booking.setStationName("Nellore");
		booking.setTrainNumber(2241);
		booking.setPlatformNumber("P2");
		booking.setLocations(Locationconstant.GUDURU);
		booking.setPersondetails(details);
		details.setName("Rajesh");
		details.setAge(22);
		details.setPhoneNumber(9080649200L);
		details.setAdhaarNumber(706089522219L);
		details.setTotalAmount(500);
		//new
		PersondetailsDto details1=new PersondetailsDto();
		details1.setName("Mallikarjuna");
		details1.setAge(24);
		details1.setPhoneNumber(9080648900L);
		details1.setAdhaarNumber(706085922219L);
		details1.setTotalAmount(400);
		RailwayDto booking1=new RailwayDto("Guduru",4561,"p3",Locationconstant.KALAHASTHI, details1);
		//new
		PersondetailsDto details2=new PersondetailsDto();
		details2.setName("Taseer");
		details2.setAge(20);
		details2.setPhoneNumber(9080648580L);
		details2.setAdhaarNumber(706085989519L);
		details2.setTotalAmount(450);
		RailwayDto booking2=new RailwayDto("Tirupathi",5641,"p4",Locationconstant.CHITTORE, details2);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize=scanner.nextInt();
		
		RailwayTicketBookingService service=new RailwayTicketBookingServiceImplimentation();
		service.setArraySize(arraySize);
		String result=service.onSave(booking);
		
		System.out.println(result);
		System.out.println(booking1);
		System.out.println(booking2);
		service.read();
		
		 System.out.println("Updatefunction");
		 String updateResult=service.Updatebydetails(booking,"Tirupathi" , 5461);
		 System.out.println(updateResult);
		 service.read();
		 
		 System.out.println("delete operation");
	        String deleteResult = service.deletebyplatformNumber("P2");
	        System.out.println(deleteResult);
	        service.read();
	}
}
