package com.xworks.programs.runner;

import com.xworks.programs.test.House;
import com.xworks.programs.test.HouseProducts;

public class HouseRunner {

	public static void main(String[] args) {
		HouseProducts prd = new House();

		prd.addHouseProductsDetails();
		prd.addElectronicprdDetails();
		prd.addFurnitureDetails();
	}

}
