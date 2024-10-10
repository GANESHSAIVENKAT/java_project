package com.xworkz.cloning.test;

public class Details implements Cloneable {

	public String name;
    public int age;
    public String address;
    public long phone;
    public String email;
    public String occupation;
    public String nationality;
    public String gender;
 
    @Override
    public Details clone()throws CloneNotSupportedException {
		return (Details)super.clone();	
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", occupation=" + occupation + ", nationality=" + nationality + ", gender=" + gender + "]";
	}
    
    
}
