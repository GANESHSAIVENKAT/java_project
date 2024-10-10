package com.google.xworkz.test;

public class Properties implements Cloneable {

	public String name;
	public int num;
	@Override
	public Properties clone() throws CloneNotSupportedException {
		return (Properties)super.clone();	
	}

	@Override
	public String toString() {
		return "Properties [name=" + name + ", Favoritenumber=" + num + "]";
	}
	
}
