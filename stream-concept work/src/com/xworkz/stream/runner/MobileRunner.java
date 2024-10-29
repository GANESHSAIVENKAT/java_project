package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MobileRunner {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Asus");
		list.add("IQOO");
		list.add("Redme");
		list.add("Realme");
		list.add("Samsung");
		list.add("Micromax");
		list.add("Pixel");
		list.add("Iphone");
		list.add("Oneplus");
		Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);
		list.stream().distinct().skip(2).limit(4).sorted(comparator).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
		Optional<String> optionalResult = list.stream().findAny();
		System.out.println(optionalResult.toString());
		System.out.println("-----------------------------------------------");
		Comparator<String> comparator1 = (String s1, String s2) -> s2.compareTo(s1);
		list.stream().distinct().sorted(comparator1).forEach(e -> System.out.println(e));

	}

}
