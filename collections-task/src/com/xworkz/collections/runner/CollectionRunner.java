package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {

	public static void main(String[] args) {
		List<String>hero=new ArrayList<String>();
		hero.add("Nani");
		hero.add("NTR");
		hero.add("Yash");
		
		List<String>nani=new ArrayList<String>();
		nani.add("Eega");
		nani.add("Hi Nanna");
		nani.add("Ninnukori");
		nani.forEach(n->System.out.println(n));
		
		List<String>ntr=new ArrayList<String>();
		ntr.add("Sakthi");
		ntr.add("Rabasa");
		ntr.add("Nannakuprematho");
		ntr.forEach(t->System.out.println(t));
		
		List<String>yash=new ArrayList<String>();
		yash.add("KGF");
		yash.add("KGF2");
		yash.add("Jaanu");
		yash.forEach(y->System.out.println(y));
	}
}
