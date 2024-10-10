package com.gogle.xworlz.runner;

import com.gogle.xworlz.test.Rapido;

public class RapidoRunner {

	public static void main(String[] args) {
		Rapido rapido=new Rapido();
		rapido.username="Ganesh";
		rapido.password=15689225;
		rapido.ratings=5;
		rapido.toplace="Brindavanam";
		Rapido rap=new Rapido();
		rap.username="Ganesh";
		rap.password=15689225;
		rap.ratings=5;
		rap.toplace="Brindavanam";
		if (rapido.equals(rap)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int name=rapido.hashCode();
		System.out.println("value"+name);
		System.out.println(rapido.toString());
		System.out.println(rap.toString());
	}
	
}
