package com.gogle.xworlz.runner;

import com.gogle.xworlz.test.Product;

public class ProductRunner {

	public static void main(String[] args) {
		Product prd=new Product();
		prd.prdname="Mobile";
		prd.price=450000;
		prd.rating=5;
		prd.buyername="Ganesh";
		Product product=new Product();
		product.prdname="Mobile";
		product.price=450000;
		product.rating=5;
		product.buyername="Ganesh";
		
		if (product.equals(prd)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int name=prd.hashCode();
		System.out.println("value"+name);
		System.out.println(product.toString());
		System.out.println(prd.toString());
	}

}
