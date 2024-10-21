package com.xworkz.studentdata.repo;


import java.util.Set;

import com.xworkz.studentdata.dto.StudentDetailsDto;


public interface StudentDetailsRepo {

	boolean onSave(StudentDetailsDto studentDetailsDto);
	Set<StudentDetailsDto> getAll();
}
