package com.xworkz.comparator.test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	String a ="Hii how are you";
	String[] ar = a.split(" ");
	List<String>list=Arrays.asList(ar);
	Comparator<String>com=(String s1,String s2)->s1.compareToIgnoreCase(s2);
	Collections.sort(list, com);
	System.out.println(list);
	
}
	
}
