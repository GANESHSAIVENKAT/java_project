package com.xworks.programs.runner;

import com.xworks.programs.test.Ganesh;
import com.xworks.programs.test.Resume;

public class GaneshResumeRunner {

	public static void main(String[] args) {
		
		Resume resume=new Ganesh();
		resume.addResumeDetails();
		resume.addPersonalDetails();
		resume.addProjectDetails();
		resume.addEducationDetails();
		resume.addHobbiesDetails();
		resume.addTechnicalDetails();
	
	}
}
