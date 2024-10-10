package com.xworkz.tracker.service;

import com.xworkz.tracker.dto.TrackingInformationDto;
import com.xworkz.tracker.repositry.TrackerInformationRepositryImplimentation;
import com.xworkz.tracker.repositry.TrackerinformationRepositry;

public class TrackingInformationImplimentation implements TrackingInformation {
	TrackerinformationRepositry info = new TrackerInformationRepositryImplimentation();

	@Override
	public boolean setArraySize(int arraySize) {
		if (arraySize > 0) {
			System.out.println("Array is given(service)");

			info.setArraySize(arraySize);
			return true;
		} else {
			System.out.println("check Array shouldnot be 0 and -values ");
		}
		return false;
	}

	@Override
	public String onSave(TrackingInformationDto trackingInformationDto) {
		System.out.println("validation and save method running");
		if (trackingInformationDto != null) {
			System.out.println("TrackingInformationDto is not null");
			if (!info.duplicateCheck(trackingInformationDto)) {
				info.onSaveinformation(trackingInformationDto);

					return "Saved sucessfully...";
				}
			}
		

		return "not save...";
	}

	@Override
	public void read() {
		TrackingInformationDto[] trackerdto = info.read();
		for (TrackingInformationDto tracking : trackerdto) {
			System.out.println("Tracker Details" + tracking);
		}

	}

	@Override
	public String onUpdate(TrackingInformationDto trackingInformationDto) {
		if (trackingInformationDto != null) {
			if (info.onUpdate(trackingInformationDto)) {
				return "Updated successfully";
			}
		}
		return "Failed to update";
	}
}
