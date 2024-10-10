package com.google.xworkz.runner;

import com.google.xworkz.target.College;
import com.google.xworkz.target.BranchDetail;

public class CollegeRunner {

	public static void main(String[] args) {
		College college=new College();
		college.branchCount=5;
		college.studentsCount=10000;
		college.isDigital=true;
					
		BranchDetail branch=new BranchDetail();
		branch.branchCount=5;
		branch.studentsCount=10000;
		branch.isDigital=true;
		branch.principalName="VinayRao";
		
		System.out.println("Total Branches: " + branch.branchCount);   
		System.out.println("Total Students: " +branch.studentsCount);  
		System.out.println("Is College Is Degital: " + branch.isDigital);  
		System.out.println("Principal Name Name: " + branch.principalName);  
		System.out.println("Total Branches: " +college.branchCount);  
		System.out.println("Total Students: " + college.studentsCount);  
		System.out.println("Is College Is Degital: " + college.isDigital);  


		
		
		
		System.out.println(branch.details(5,10000,true));
	}

}
