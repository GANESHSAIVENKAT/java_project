package com.xworkz.tracker.repositry;

import com.xworkz.tracker.dto.TrackingInformationDto;

public interface TrackerinformationRepositry {

	boolean setArraySize(int arraySize);
	boolean onSaveinformation(TrackingInformationDto trackingInformationDto);
	TrackingInformationDto[] read();
	boolean duplicateCheck(TrackingInformationDto dto);
	boolean onUpdate(TrackingInformationDto trackingInformationDto);
}
