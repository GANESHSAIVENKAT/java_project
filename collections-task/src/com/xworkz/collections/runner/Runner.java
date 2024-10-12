package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Runner {

	public static void main(String[] args) {
		Collection<String> college = new ArrayList<String>();
		college.add("Audisankara");
		college.add("Narayana");
		college.add("SVC");
		college.add("Surana College");
		college.add("Bangalore Medical College and Research Institute");
		System.out.println(college);
//		 Object[] collegeArray = college.toArray();
//		 college.toArray();
//		 System.err.println(college);
		Collection<String> moreColleges = new ArrayList<>();
		moreColleges.add("Princeton University");
		moreColleges.add("Yale University");
		college.addAll(moreColleges);
		System.out.println("After addAll " + college);
		college.remove("Audisankara");
		System.out.println("Remove::" + college);

		college.removeAll(moreColleges);
		System.out.println("After removeAll: " + college);
		System.out.println("Size::" + college.size());
		boolean containsNarayana = college.contains("Narayana");
		System.out.println("Contains Narayana : " + containsNarayana);

		boolean containsAllColleges = college.containsAll(moreColleges);
		System.out.println("Contains all colleges: " + containsAllColleges);

		college.clear();
		System.out.println(college);

		Collection<String> company = new ArrayList<String>();
		company.add("Tata Consultancy Services");
		company.add("Google");
		company.add("Amazon");
		company.add("Microsoft");
		company.add("Salesforce");
		System.out.println(company);
		System.out.println("Size::" + company.size());
		Collection<String> moreCompanies = new ArrayList<>();
		moreCompanies.add("Xworkz");
		moreCompanies.add("Terralogic");
		company.addAll(moreCompanies);
		System.out.println("After addAll " + company);
		company.remove("Google");
		System.out.println("Remove::" + company);

		company.removeAll(moreCompanies);
		System.out.println("After removeAll: " + company);

		boolean containsGoogle = college.contains("Google");
		System.out.println("Contains Google : " + containsGoogle);

		boolean containsAllcompany = company.containsAll(moreCompanies);
		System.out.println("Contains all company: " + containsAllcompany);

		company.clear();
		System.out.println(company);

	}
}
