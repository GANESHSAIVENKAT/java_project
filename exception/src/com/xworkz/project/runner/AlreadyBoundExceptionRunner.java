package com.xworkz.project.runner;

import java.rmi.AlreadyBoundException;

import com.xworkz.project.test.AlreadyBound;

public class AlreadyBoundExceptionRunner {
	public static void main(String[] args) throws  AlreadyBound {
	       String message = "Xworkz";
	       String name = " xworkz";
			try {
				
				if(name.equals(message) ) {
					throw new AlreadyBoundException("Name Already bound");
				}else {
					throw new AlreadyBoundException("Name not equal");
				}
			}
	       catch(AlreadyBoundException e){
				System.out.println(" caught:"+e.getMessage());
			}
			System.out.println("Throw class Running");
			throw new  AlreadyBound("Xworkz");
		}

	}

