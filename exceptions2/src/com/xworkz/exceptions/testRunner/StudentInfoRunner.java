package com.xworkz.exceptions.testRunner;

import com.xworkz.exceptions.test.StudentInfo;

public class StudentInfoRunner {

	public static void main(String[] args) {
	StudentInfo info = new StudentInfo();
	info.studentName="Vaasanthi";
	info.id=21;
	try {
		String userName = info.studentName  + info.id;
		System.out.println("userName:"+userName);
		int user = info.id / 0;
		System.out.println("user"+user);
	}
	finally {
		System.out.println("combination of id and studentname");
	}
	}

}
