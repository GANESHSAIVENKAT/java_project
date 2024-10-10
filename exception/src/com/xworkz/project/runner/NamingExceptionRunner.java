package com.xworkz.project.runner;

import javax.naming.NamingException;

import com.xworkz.project.test.NamingExceptions;

public class NamingExceptionRunner {

	public static void main(String[] args) throws NamingExceptions{
		try {
            String name = "InvalidName"; 

            if (name.equals("InvalidName")) {
                throw new NamingException("The name '" + name + "' is same");
            }

            System.out.println("Name is not same.");
        } catch (NamingException e) {
            System.out.println("NamingException caught: " + e.getMessage());
            throw new NamingExceptions("Naming exception");
        }

        System.out.println("Execution continues...");

	}

}
