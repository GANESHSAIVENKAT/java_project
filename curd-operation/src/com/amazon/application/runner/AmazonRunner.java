package com.amazon.application.runner;
import  com.amazon.application.products.Amazon;
public class AmazonRunner {

	public static void main(String[] args) {
		
		Amazon product=new Amazon();
		int size=product.getlength();
		System.out.println("length of products is:"+size);
		System.out.println("========Create And Read=========");
		product.createbyproducts ("Mobile ");
		product.createbyproducts ("Laptopspects");
		product.createbyproducts ("Earbuds");
		product.createbyproducts ("Groceries");
		product.createbyproducts ("Shoes");
		
		product.readbyproducts();
		System.out.println("========Update=========");
		product.updatebyproducts("Mobile","Shoes");
		product.readbyproducts();
		System.out.println("========Delete=========");
		product.deletebyproducts("Earbuds");
		product.readbyproducts();
		System.out.println("========Search=========");
		product.searchbyproducts("Laptopspects");
		product.readbyproducts();
		
	}

}
