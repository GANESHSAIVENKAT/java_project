package com.xworkz.collections.runner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missingwords {

	public static void main(String[] args) {

		String s1 = "hello good morning";
		String s2 = "morning";
		
		List<String>w1=new ArrayList<String>(Arrays.asList(s1.split(" ")));
		
		List<String>w2=new ArrayList<>(Arrays.asList(s2.split(" ")));
		
		w1.removeAll(w2);
		System.out.println(w1);
		
	}

}
