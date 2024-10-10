package com.xworkz.project.test;

public class CertificateExceptions extends Throwable{

	public CertificateExceptions(String message) {
		super(message);
		System.out.println("CertificateExceptions constructor is running");
	}

}