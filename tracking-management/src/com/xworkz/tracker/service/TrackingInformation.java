package com.xworkz.tracker.service;

import com.xworkz.tracker.dto.TrackingInformationDto;

public interface TrackingInformation {

	boolean setArraySize(int arraySize);
	String onSave(TrackingInformationDto trackingInformationDto);
	void read();
	String onUpdate(TrackingInformationDto trackingInformationDto); 
}

