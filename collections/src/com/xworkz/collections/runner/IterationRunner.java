package com.xworkz.collections.runner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterationRunner {

	public static void main(String[] args) {
		System.out.println("Main method running");
		
		List<String> list =new LinkedList<String>();
		list.add("Hi");
		
		
		

		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Element ::"+iterator.next());
		}
		iterator.remove();
	}
}
