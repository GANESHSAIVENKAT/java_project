package com.xworkz.tracker.repositry;

import java.util.Iterator;

import com.xworkz.tracker.dto.TrackingInformationDto;

public class TrackerInformationRepositryImplimentation implements TrackerinformationRepositry {

	private TrackingInformationDto[] listofarray;
	private int index = 0;

	@Override
	public boolean setArraySize(int arraySize) {
		listofarray = new TrackingInformationDto[arraySize];
		if (arraySize == listofarray.length) {
			System.out.println("Array is given by user");
		} else {
			System.out.println("Array is not given");
		}
		return false;
	}

	@Override
	public boolean onSaveinformation(TrackingInformationDto trackingInformationDto) {
		System.out.println("TrackingInformationDto onsave running");
		if (listofarray != null) {
			if (this.index < this.listofarray.length) {
				listofarray[index] = trackingInformationDto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public TrackingInformationDto[] read() {
		
		return listofarray;
	}
	@Override
	public boolean duplicateCheck(TrackingInformationDto dto) {
		if(listofarray!=null) {
			for (int i = 0; i < listofarray.length; i++) {
				if (listofarray[i]!=null&&listofarray[i].equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	  @Override
	    public boolean onUpdate(TrackingInformationDto trackingInformationDto) {
	        for (int i = 0; i < listofarray.length; i++) {
	            if (listofarray[i] != null && listofarray[i].equals(trackingInformationDto)) {
	                listofarray[i] = trackingInformationDto; 
	                return true;
	            }
	        }
	        return false; 
	    }



}
