package com.google.xworkz.runner;
import com.google.xworkz.target.Gadget;
import com.google.xworkz.target.Mobile;
public class GadgetRunner {

	public static void main(String[] args) {
		Gadget gadget=new Gadget();
		gadget.brand="Oppo";
		gadget.thickness=1.0;
		gadget.weight=1.0f;
					
		Mobile mobile=new Mobile();
		mobile.brand="Oppo";
		mobile.Rating=5;
		mobile.thickness=1.0;
		mobile.weight=1.0f;
		
		System.out.println("Mobile Rating: " + mobile.Rating);   
		System.out.println("Brand Name: " +gadget.brand);  
		System.out.println("Thickness: " + gadget.thickness);  
		System.out.println("Weight: " + gadget.weight);  
		System.out.println("Brand Name: " +mobile.brand);  
		System.out.println("Thickness: " + mobile.thickness);  
		System.out.println("Weight: " + mobile.weight);  

	}

}
