package com.xworkz.collections.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRunner {

	public static void main(String[] args) {
		System.out.println("Main Method Running");
		
		List<String> list=new LinkedList<String>();
		list.add("ganeshsaivenkat.c@gmail.com");
		list.add("ganeshsai224466@gmail.com");
		
		ListIterator<String> listIterator=list.listIterator();
		listIterator.add("abscedfsj@gmail.com");
		listIterator.add("yubscedfsj@gmail.com");
		listIterator.add("opscedfsj@gmail.com");
		
		list.remove(1);
		list.forEach(i -> System.out.println("After Remove:"+i));
		
		System.err.println("Search:"+list.contains("ganeshsai224466@gmail.com"));
		
		list.add(2, "ahgydywhjsi@gmail.com");
		list.forEach(i -> System.out.println("After update:"+i));

}
}
