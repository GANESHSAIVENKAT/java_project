package com.xworkz.studentdata.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.studentdata.dto.StudentDetailsDto;
import com.xworkz.studentdata.repo.StudentDetailsRepoImplimentation;
import com.xworkz.studentdata.service.StudentDetailsService;
import com.xworkz.studentdata.service.StudentDetailsServiceImplimentation;

public class StudentDetailsRunner {

	public static void main(String[] args) {
		StudentDetailsDto details = new StudentDetailsDto();
		details.setStudentName("Ganesh");
		details.setStudentId(307);
		details.setStudentContact(8309809043l);
		details.setStudentClass("10th Class");
		StudentDetailsService service = new StudentDetailsServiceImplimentation(new StudentDetailsRepoImplimentation());

		String result = service.validate(details);
		System.out.println(result);
		System.out.println(service.getAll());

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
		StudentDetailsDto details1 = new StudentDetailsDto();
		details1.setStudentName("Ramu");
		details1.setStudentId(305);
		details1.setStudentContact(9390025995l);
		details1.setStudentClass("12th Class");

		List<StudentDetailsDto> list = new ArrayList<StudentDetailsDto>();
		list.add(details1);
		Stream<StudentDetailsDto> studentstream = list.stream();
		studentstream.forEach(s -> System.out.println(s));

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
		List<StudentDetailsDto> listdto = list.stream().collect(Collectors.toList());
		listdto.stream().distinct().forEach(s -> System.out.println(s));
	}

}
