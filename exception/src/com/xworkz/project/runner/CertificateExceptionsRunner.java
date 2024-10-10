package com.xworkz.project.runner;
import java.security.cert.CertificateException;

import com.xworkz.project.test.CertificateExceptions;

public class CertificateExceptionsRunner {

	public static void main(String[] args) throws CertificateExceptions  {
		 
				try {
		            int checkAge =21 ;  
		            if(checkAge<18) {
		            	throw new CertificateException("age is must be 18 or older");
		            }
		            else {
		            	throw new CertificateException("age is correct");
		            }
		       } catch (CertificateException e) {
		            System.out.println("Caught an exception: " + e.getMessage());

		        }
				
				
		        System.out.println("Program continues...");
		        throw new CertificateExceptions("hi ");
		    }

			

		
	
}
