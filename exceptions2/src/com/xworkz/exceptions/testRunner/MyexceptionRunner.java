package com.xworkz.exceptions.testRunner;

import com.xworkz.exceptions.test.MyException;

public class MyexceptionRunner {

	public static void main(String args[]){
		try {

			throw new MyException("RadheRadhe");
		} catch (MyException ex) {
		

			System.out.println("Caught exception:"+ex.getMessage());
		}
	}
}
