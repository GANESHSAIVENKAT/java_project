package com.xworks.programs.test;

public class Vinayakachavithi implements DjRequriments{

	@Override
	public void addDjDetails() {
		System.out.println("Running DjRequriments");
	}

	@Override
	public void addSpeakerDetails() {
		System.out.println("Product Name:"+ DjRequriments.name);
		System.out.println("Product Required :"+ DjRequriments.require);
		System.out.println("Product Cost:"+ DjRequriments.eachcost);
	}

	@Override
	public void addGeneratorDetails() {
		System.out.println("Product Name:"+ DjRequriments.name1);
		System.out.println("Product Required :"+ DjRequriments.requirecount);
		System.out.println("Product Cost:"+ DjRequriments.eachcost1);
		
	}



}
