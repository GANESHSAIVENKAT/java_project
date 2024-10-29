package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberRunner {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(10);
		list.add(80);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(100);
		list.add(70);
		list.add(110);
		list.add(90);
		Comparator<Integer> comparator = (Integer s1, Integer s2) -> s1.compareTo(s2);
		list.stream().distinct().skip(2).limit(4).sorted(comparator).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
		Optional<Integer> optionalResult = list.stream().findAny();
		System.out.println(optionalResult.toString());
		System.out.println("--------------------------------------------------------------");
		Comparator<Integer> comparator1 = (Integer s1, Integer s2) -> s2.compareTo(s1);
		list.stream().distinct().sorted(comparator1).forEach(e -> System.out.println(e));

	}

}
