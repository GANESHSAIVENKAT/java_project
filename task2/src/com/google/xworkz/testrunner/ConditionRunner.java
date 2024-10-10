package com.google.xworkz.testrunner;

import java.util.Scanner;

public class ConditionRunner {
	static int index=0;
	static String[] stringArray;
	
	
	public ConditionRunner(int arraysize) {
		this.stringArray=new String[arraysize];
	}
	public static String onsave(String sentence) {
		if(sentence!=null && !sentence.isEmpty()&&sentence.length()<16&&sentence.length()>3&&sentence.startsWith("s")&&sentence.endsWith("a")) {
			System.out.println("validation is done");
			if(index<stringArray.length) {
				stringArray[index]=sentence;
				index++;
				return"saved successfull";
			}else {
				return"not saved successfull";
			}
		}
		
		return "not validate";
	}
	public static void main(String[] args) {
		ConditionRunner save=new ConditionRunner(5);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter sentence");
		
		System.out.println(save.onsave(scanner.nextLine()));
		scanner.close();

	}

}
