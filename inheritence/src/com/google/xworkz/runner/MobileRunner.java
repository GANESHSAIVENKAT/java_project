package com.google.xworkz.runner;
import java.util.Date;

import com.google.xworkz.test.AsusMobile;
import com.google.xworkz.test.Mobile;
public class MobileRunner {

	public static void main(String[] args) {
		
		Mobile details=new Mobile();
		AsusMobile mobile=new AsusMobile();
		mobile.date = new Date();
		System.out.println("Purchased Date: " + mobile.date);
		System.out.println(mobile.details("Asus",5.9f,20.0));
		
	}

}
