package com.xworkz.collections.runner;

import java.util.Comparator;

public class ListRunner {
public static void main(String[] args) {
	
	Comparator<String>comparator =new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			if(o1.equals(o2))
			return 0;
			else
			return 1;
		}
	};
	int value= comparator.compare("Vaasanthi", "Vaasanthi");
	System.out.println(value);
	//lambda expression
	Comparator<String>comparator1 =  (String s1,String s2)->s1.equals(s2)? 0:1;
	System.out.println("Result:"+comparator1.compare("Rajesh", "Rajesh"));
	
	Test compare1=(String a1,String b1)->a1.equals(b1)? "Same":"NotSame";
	System.out.println(""+compare1.value("Rajesh", "Mallikarjuna"));
}
	
}
