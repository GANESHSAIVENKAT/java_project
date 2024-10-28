package com.xworkz.streamsrunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(9);
		System.out.println("Distinct elements");
		Collections.sort(list);
		list.stream().distinct().forEach(s->System.out.println(s));
		 int count = (int) list.stream().count();
		 System.out.println("Count::"+count);
		 int sum = list.stream().mapToInt(Integer::intValue).sum();
		 System.out.println("Sum is :"+sum);
		 System.out.println("===========================================================");
		 
		List<String> list1 =new ArrayList<String>();
		list1.add("Rajesh");
		list1.add("Mallikarjuna");
		list1.add("Taseer");
		list1.add("Nithin");
		list1.add("Sashi");
		list1.add("Prajwal");
		list1.add("Rashmi");
		
		System.out.println("Distinct elements");
		
		list1.stream().distinct().forEach(e->System.out.println(e));
	}
}
