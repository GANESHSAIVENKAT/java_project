package com.xworks.programs.test;

public class Freshers implements Software{

	@Override
	public void addSoftwareDetails() {
		System.out.println("Running Software Details");
		
	}

	@Override
	public void addCompanyDetails() {
		System.out.println("Company Name:"+ Software.company);
		System.out.println("Chairman Name:"+ Software.chairman);
		System.out.println("Staff count:"+ Software.staff);
		System.out.println("Vacancy count:"+ Software.vacancy);
		
	}

	@Override
	public void addSkillsDetails() {
		System.out.println("Skills Required:"+ Software.skillsreq);
		
	}

	@Override
	public void addsalaryDetails() {
		System.out.println("Pakage Details:"+ Software.pakage);
		
	}

}
