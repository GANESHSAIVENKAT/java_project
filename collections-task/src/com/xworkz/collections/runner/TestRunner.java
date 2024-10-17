package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestRunner {

	public static void main(String[] args) {
		List<String> stream = new ArrayList<String>();
		stream.add("MechanicalEngineering");
		stream.add("CivilEngineering");
		stream.add("CSE");
		stream.add("ECE");
		stream.add("EEE");
		stream.forEach(i -> System.out.println(i));
		List<String> newStream = new ArrayList<String>();
		newStream.add("AutomobileEngineering");
		newStream.add("AerospaceEngineering");
		newStream.add("ChemicalEngineering");
		stream.addAll(newStream);
		stream.forEach(i -> System.out.println(i));
		System.out.println("-------------remove index------------------");
		stream.remove(1);
		stream.forEach(i -> System.out.println(i));
		System.out.println("---------------toarray------------------------------");
		Object[] array = stream.toArray();
		for (Object a : array) {
			System.err.println(a);

		}
		System.out.println("-------------tostring------------------");
	      String detailsString = stream.toString();
	      System.out.println("LinkedList converted to String: " + detailsString);
			System.out.println("-------------removeall------------------");
		stream.removeAll(newStream);
		stream.forEach(i -> System.err.println(i));
		System.out.println("-------------equals------------------");
		System.out.println(stream.equals(newStream));
		System.out.println("-------------lastindex------------------");
		System.out.println(stream.lastIndexOf("BMW"));
		System.out.println("-------------sublist------------------");
		System.out.println(stream.subList(0, 2));
		System.out.println("-------------add index------------------");
		stream.add(1, "Mechatronics");
		stream.forEach(i -> System.err.println(i));
		System.out.println("-------------contains------------------");
		System.out.println(stream.contains("ECE"));
		System.out.println("-------------get index------------------");
		System.out.println(stream.get(1));
		System.out.println("-------------indexof------------------");
		System.out.println(stream.indexOf("CSE"));
		System.out.println("-------------is empty------------------");
		System.out.println(stream.isEmpty());
		System.out.println("-------------lastIndexOf------------------");
		System.out.println(newStream.lastIndexOf("AutomobileEngineering"));
		System.out.println("-------------set------------------");
		stream.set(1, "Aeronoticalengineering");
		stream.forEach(i -> System.err.println(i));
		System.out.println("-------------size------------------");
		System.out.println(stream.size());
        System.out.println("-------------stream()------------------");
        System.out.println(stream.stream());
        System.out.println(stream.retainAll(newStream));
		

	}
}
