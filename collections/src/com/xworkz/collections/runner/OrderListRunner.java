package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.collections.dto.MobilesDto;

public class OrderListRunner {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);

		Comparator<Integer> comp = (Integer s3, Integer s4) -> s4.compareTo(s3);
		Collections.sort(numbers, comp);
		System.out.println("Sort:::" + numbers);
		System.out.println("==================================");
		List<Character> characters = new LinkedList<Character>();
		characters.add('A');
		characters.add('B');
		characters.add('C');
		characters.add('D');
		characters.add('E');
		characters.add('F');
		characters.add('G');
		characters.add('H');
		characters.add('I');
		characters.add('J');
		characters.add('K');
		characters.add('L');
		characters.add('M');
		characters.add('N');
		characters.add('O');
		characters.add('P');
		characters.add('Q');
		characters.add('R');
		System.out.println(characters);
		System.out.println(characters.size());
		Comparator<Character> comp1 = (Character s5, Character s6) -> s6.compareTo(s5);
		Collections.sort(characters, comp1);
		System.out.println("Sort:::" + characters);
		System.out.println("==================================");

		MobilesDto name = new MobilesDto();

		name.setName("Redmi");
		MobilesDto name1 = new MobilesDto();
		name1.setName("Micromax");

		List<MobilesDto> li = new ArrayList<MobilesDto>();
		li.add(name1);
		li.add(name);
		System.out.println(li);
		Comparator<MobilesDto> comp2 = (MobilesDto s6, MobilesDto s7) -> s7.getName().compareToIgnoreCase(s6.getName());
		Collections.sort(li, comp2);
		System.out.println("Sort:::" + li);

	}
}
