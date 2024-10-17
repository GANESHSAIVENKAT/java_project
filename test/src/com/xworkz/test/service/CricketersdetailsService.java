package com.xworkz.test.service;

import com.xworkz.test.dto.CricketersListDto;

public interface CricketersdetailsService {

	boolean setArraySize(int arraySize);
	String onSaveData(CricketersListDto cricketersListDto);

	void read();
	 String onUpdate(CricketersListDto cricketersListDto,int newjnumber);
	 String deleteData(int jnumber);
	
}
