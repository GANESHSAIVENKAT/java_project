package com.google.voteridapplication.application;

public class Bottle {

	public String bottlename;
	public int price;
	public static void info() {
		 
		System.out.println("BottleInfo");
	}
	public static void info( String bottlename) {
		
		System.out.println(bottlename);
	}

	public static void info( String bottlename, int price) {
		 
		System.out.println(bottlename+","+price);
		
	}

}
