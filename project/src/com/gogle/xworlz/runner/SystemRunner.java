package com.gogle.xworlz.runner;

import com.gogle.xworlz.test.Systems;

public class SystemRunner {

	public static void main(String[] args) {
		Systems sys=new Systems();
		sys.name="Mobile";
		sys.brand="Asus";
		sys.buyername="Ganesh";
		sys.price=100000;
		Systems info=new Systems();
		info.name="Mobile";
		info.brand="Asus";
		info.buyername="Ganesh";
		info.price=500000;
		
		if (sys.equals(info)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int name=sys.hashCode();
		System.out.println("value"+name);
		System.out.println(sys.toString());
		System.out.println(info.toString());
	}

}
