package com.google.xworkz.testrunner;

import com.google.xworkz.test.Properties;

public class ExceptionRunner {

	public static void main(String[] args) {
		System.out.println("main method started");
		Properties properties = new Properties();
		properties.name = "Mallikarjuna";
		properties.num=1;
		System.out.println("before properties"+properties);

		try {
			Properties properties1=	properties.clone();
			System.out.println("before properties1"+properties1);
			properties1.name="Rajesh";
			properties1.num=2;
			System.out.println("after properties1"+properties1);
			System.out.println("after properties"+properties);
		}catch(CloneNotSupportedException e) {
			e.fillInStackTrace();
		}
	}
}
