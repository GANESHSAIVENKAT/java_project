package com.xworkz.cloning.runner;

import com.xworkz.cloning.test.Details;

public class DetailRunner {

	public static void main(String[] args) {
		System.out.println("main method started");
		Details details=new Details();
		details.name="Ganesh";
		details.age=22;
		details.address="Nellore";
		details.phone=8309809043L;
		details.email="ganeshsai224466@gmail.com";
		details.gender="Male";
		details.nationality="Indian";
		details.occupation="Studying";
		System.out.println("details"+details);
		try {
		Details details1=details.clone();
		details1.name="Ramu";
		details1.age=21;
		System.out.println("details1"+details1);
		}catch(CloneNotSupportedException e){
			e.fillInStackTrace();
		}

	}

}
