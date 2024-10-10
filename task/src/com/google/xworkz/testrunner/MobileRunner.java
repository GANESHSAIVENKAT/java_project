package com.google.xworkz.testrunner;

import com.google.xworkz.test.Mobile;
import com.google.xworkz.test.Phone;

public class MobileRunner {

	public static void main(String[] args) {
	  
		Mobile mobile=new Mobile();
		mobile.display(); 
	    Phone derived = new Phone();
	    derived.display();   
	    Mobile mob1 = new Mobile();
	    Mobile mob2 = new Mobile("Redmi");
	    
	    Phone p1 = new Phone();
	    Phone p2 = new Phone("Redmi");
	    Phone p3 = new Phone("Redmi", 120000);

	    derived.brand("Asus");
	    derived.setNumber(200000);
	   
	    System.out.println("mob1 hashCode: " + mob1.hashCode());
	    System.out.println("p1 hashCode: " + p1.hashCode());
	    System.out.println("mob1 equals : " + mob1.equals(p1));
	    System.out.println("base1 toString: " + mob1.toString());
	    System.out.println("p1 toString: " + p1.toString());
	}

}
