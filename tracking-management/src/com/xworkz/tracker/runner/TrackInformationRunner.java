package com.xworkz.tracker.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.tracker.dto.TrackingInformationDto;
import com.xworkz.tracker.service.TrackingInformation;
import com.xworkz.tracker.service.TrackingInformationImplimentation;

public class TrackInformationRunner {

	public static void main(String[] args) {
		TrackingInformationDto tracker=new TrackingInformationDto();
		tracker.setTrackerId(12566);
		tracker.setPackageName("Mobile");
		tracker.setFromlocation("Mumbai");
		tracker.setTolocation("Nellore");
		tracker.setPakagedate(LocalDateTime.of(2024, 1, 4, 1, 22));
		tracker.setDeleverydate(LocalDateTime.now().plusDays(7));
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize=scanner.nextInt();
		TrackingInformation track=new TrackingInformationImplimentation();
		track.setArraySize(arraySize);
		
		String result=track.onSave(tracker);
		String result1=track.onSave(tracker);
		System.err.println(result);
		System.err.println(result1);
		
		track.read();
		System.out.println("Updating tracker");
		tracker.setPackageName("Flute");
		System.out.println(track.onUpdate(tracker));
		track.read();
		scanner.close();
	}

}

