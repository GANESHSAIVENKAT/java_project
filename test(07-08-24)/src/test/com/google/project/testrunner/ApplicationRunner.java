package test.com.google.project.testrunner;

import test.com.google.project.test.Bank;
import test.com.google.project.test.Location;

public class ApplicationRunner {

	public static void main(String[] args) {
		Bank bank=new Bank();
		Location loc=new Location();
		
		bank.show();
		bank.display();
		System.out.println("=======================================");
		loc.show();
		loc.present();

	}

}
