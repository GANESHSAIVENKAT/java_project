package com.xworks.programs.test;

public class House implements HouseProducts{

	@Override
	public void addHouseProductsDetails() {
		System.out.println("Running HouseProducts Details");
		
	}

	@Override
	public void addElectronicprdDetails() {
		System.out.println("Fan count:"+ HouseProducts.fan);
		System.out.println("Light count:"+ HouseProducts.light);
		System.out.println("Washingmachine count:"+ HouseProducts.washingmachine);
		System.out.println("Totalprice:"+ HouseProducts.totalcost);
		
	}

	@Override
	public void addFurnitureDetails() {
		System.out.println("Bed count:"+ HouseProducts.bed);
		System.out.println("Table count:"+ HouseProducts.dainingtable);
		System.out.println("Door+Windows count:"+ HouseProducts.door);
		System.out.println("Totalprice:"+ HouseProducts.totalcost1);
		
	}

	
}
