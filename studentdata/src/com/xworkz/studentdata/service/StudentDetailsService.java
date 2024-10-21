package com.xworkz.studentdata.service;

import java.util.Set;

import com.xworkz.studentdata.dto.StudentDetailsDto;

public interface StudentDetailsService {

	String validate(StudentDetailsDto studentDetailsDto);
	Set<StudentDetailsDto> getAll();
}
