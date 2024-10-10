package com.xworkz.cloning.test;

public class Person implements Cloneable {

	public String name;
    public int age;
    public String address;
    public long phone;
    public String email;
    public String occupation;
    public String nationality;
    public String gender;
 
    @Override
    public Person clone()throws CloneNotSupportedException {
		return (Person)super.clone();	
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", occupation=" + occupation + ", nationality=" + nationality + ", gender=" + gender + "]";
	}
    
    
}
