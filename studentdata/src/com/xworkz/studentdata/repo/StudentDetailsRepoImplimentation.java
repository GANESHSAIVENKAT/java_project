package com.xworkz.studentdata.repo;

import java.util.LinkedHashSet;
import java.util.Set;

import com.xworkz.studentdata.dto.StudentDetailsDto;

public class StudentDetailsRepoImplimentation implements StudentDetailsRepo {

	Set<StudentDetailsDto>detail=new LinkedHashSet<StudentDetailsDto>();
	@Override
	public boolean onSave(StudentDetailsDto studentDetailsDto) {
		System.out.println("save running");
		return detail.add(studentDetailsDto);
	}

	@Override
	public Set<StudentDetailsDto> getAll() {
		
		return detail;
	}

}
