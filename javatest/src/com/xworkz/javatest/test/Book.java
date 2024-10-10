package com.xworkz.javatest.test;

public class Book {

	private String title;
	private String author;
	private double price;

	
	public Book(String title) {
		this.title = title;
		System.out.println("Title Name:"+title);
		
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("Title Name:"+title);	
		System.out.println("AuthorName:"+author);
	}

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("Title Name:"+title);
		System.out.println("AuthorName:"+author);
		System.out.println("Price: "+price);
		
	}

}
