package com.xworkz.studentdata.service;

import java.util.Set;

import com.xworkz.studentdata.dto.StudentDetailsDto;
import com.xworkz.studentdata.repo.StudentDetailsRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor

public class StudentDetailsServiceImplimentation implements StudentDetailsService {

	private StudentDetailsRepo repo;
	@Override
	public String validate(StudentDetailsDto studentDetailsDto) {
		System.out.println("Validate is running");
		if(studentDetailsDto!=null){
			if(repo.onSave(studentDetailsDto)) {
				return"Saved sucessfully";
			}
		}
		return "Not Saved sucessfully";
	}

	@Override
	public Set<StudentDetailsDto> getAll() {
		
		return repo.getAll();
	}

}
