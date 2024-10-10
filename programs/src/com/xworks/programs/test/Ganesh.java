package com.xworks.programs.test;

public class Ganesh implements Resume {

	@Override
	public void addResumeDetails() {
		System.out.println("Resume details of Ganesh");
		
	}

	@Override
	public void addPersonalDetails() {	
		System.out.println("PersonalDetails"+Resume.name);
		System.out.println(Resume.contact);
		System.out.println(Resume.mail);

		
	}

	@Override
	public void addProjectDetails() {
		System.out.println("ProjectDetails");
		
		System.out.println("ProjectName"+Resume.projectname);
	}

	@Override
	public void addHobbiesDetails() {
		System.out.println("HobbiesDetails");
		
		System.out.println("Hobbies:"+Resume.hobbies);
		
		
	}

	@Override
	public void addEducationDetails() {
		System.out.println("EducationDetails");
		
		System.out.println("Education:"+Resume.education);
		
	}

	@Override
	public void addTechnicalDetails() {
		System.out.println("TechnicalDetails");
		System.out.println(Resume.Technical);
		
	}

}
