package com.xworkz.exceptions.test;

public class StudentInfo {
	public int id;
	public String studentName;
	
	public StudentInfo Clone() {
		System.out.println("clone");
		return (StudentInfo) new StudentInfo();
	}

	@Override
	public String toString() {
		return "StudentInfo [Id=" + id + ", studentName=" + studentName + "]";
	}


}
