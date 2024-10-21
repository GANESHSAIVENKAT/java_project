package com.xworkz.studentdata.runner;

import com.xworkz.studentdata.dto.StudentDetailsDto;
import com.xworkz.studentdata.repo.StudentDetailsRepoImplimentation;
import com.xworkz.studentdata.service.StudentDetailsService;
import com.xworkz.studentdata.service.StudentDetailsServiceImplimentation;

public class StudentDetailsRunner {

	public static void main(String[] args) {
		StudentDetailsDto details=new StudentDetailsDto();
		details.setStudentName("Ganesh");
		details.setStudentId(307);
		details.setStudentContact(8309809043l);
		details.setStudentClass("10th Class");
		 StudentDetailsService service = new StudentDetailsServiceImplimentation(new StudentDetailsRepoImplimentation());

		 String result=service.validate(details);
		System.out.println(result);
		System.out.println(service.getAll());
	}

}
