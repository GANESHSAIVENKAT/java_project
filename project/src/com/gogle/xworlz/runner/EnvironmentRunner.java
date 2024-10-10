package com.gogle.xworlz.runner;

import com.gogle.xworlz.test.Environment;

public class EnvironmentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Environment environment=new Environment();
		environment.air="Mixture";
		environment.ispoluted=true;
		environment.season="Summer";
		environment.tempurature=25;
		Environment env=new Environment();
		env.air="Mixture";
		env.ispoluted=true;
		env.season="Summer";
		env.tempurature=25;
		if (environment.equals(env)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int name=environment.hashCode();
		System.out.println("value"+name);
		System.out.println(environment.toString());
		System.out.println(env.toString());
	}
	

}
