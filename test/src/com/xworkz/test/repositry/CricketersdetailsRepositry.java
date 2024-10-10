package com.xworkz.test.repositry;

import com.xworkz.test.dto.CricketersListDto;

public interface CricketersdetailsRepositry {

	boolean setArraySize(int arraySize);
	boolean onSaveData(CricketersListDto cricketersListDto);
	boolean duplicateCheck(CricketersListDto dto);
	CricketersListDto[] read();
	 boolean onUpdate(CricketersListDto cricketersListDto,int newjnumber);
	 boolean deleteData(int jnumber);
	 boolean displayplayerRunRateBetween30And50();


}
