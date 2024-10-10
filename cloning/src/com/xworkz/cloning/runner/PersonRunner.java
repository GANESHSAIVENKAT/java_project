package com.xworkz.cloning.runner;

import com.xworkz.cloning.test.Person;

public class PersonRunner {

	public static void main(String[] args) {
		System.out.println("main method started");
		Person person=new Person();
		person.name="Ganesh";
		person.age=22;
		person.address="Nellore";
		person.phone=8309809043L;
		person.gender="ganeshsai224466@gmail.com";
		person.gender="Male";
		person.nationality="Indian";
		person.occupation="Studying";
		
		System.out.println("Before person"+person);
		try {
			Person person1=person.clone();
			System.out.println("Before person1"+person1);
			person1.name="Ramu";
			person1.age=22;
			person1.address="sullurupeta";
			person1.phone=9390025995L;
			person1.email="ramu224466@gmail.com";
			person1.gender="Male";
			person1.nationality="Indian";
			person1.occupation="Job";
			System.out.println("After person1"+person1);
			System.out.println("After person"+person);
		}catch(CloneNotSupportedException e) {
			e.fillInStackTrace();
		}
	}

}
