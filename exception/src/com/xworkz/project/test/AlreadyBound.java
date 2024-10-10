package com.xworkz.project.test;

public class AlreadyBound extends Throwable {

	public AlreadyBound(String name) {
		System.out.println("Name is:"+name);
		System.out.println("calling");
	}
}