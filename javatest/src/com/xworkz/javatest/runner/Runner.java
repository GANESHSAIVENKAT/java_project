package com.xworkz.javatest.runner;

import com.xworkz.javatest.test.BankAccount;
import com.xworkz.javatest.test.Book;
import com.xworkz.javatest.test.Calculator;
import com.xworkz.javatest.test.Circle;
import com.xworkz.javatest.test.Dog;
import com.xworkz.javatest.test.Game;
import com.xworkz.javatest.test.InsufficientFundsException;
import com.xworkz.javatest.test.Person;
import com.xworkz.javatest.test.Rectangle;
import com.xworkz.javatest.test.Shape;

import lombok.Getter;

public class Runner {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();// 4 Question
		System.out.println(calculator.add(2, 5));
		System.out.println(calculator.add(5.2, 6.5));
		System.out.println(calculator.add(5, 6, 7));

		System.out.println("New program");// 5 Question
		Game game = new Game();
		game.play();
		game.run();
		System.out.println("===========new==========");// 6 Question
		try {

			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught: " + e.getMessage());

			try {
				int[] arr = { 1, 2, 3 };
				System.out.println(arr[5]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("ArrayIndexOutOfBoundsException caught: " + ex.getMessage());
			}

		}
		System.out.println("===========new=========");// 8 Question
		BankAccount account = new BankAccount(500);
		try {
			account.withdraw(600);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("InsufficientFundsException Completed");// 9 Question
		}
		System.out.println("==========new========");// 10 Question
		Person person = new Person("John", 25);
		person.setName("Ganesh");
		person.setAge(21);
		System.out.println("Name" + person.getName());
		System.out.println("Age" + person.getAge());

		System.out.println("==========new========");// 11 Question
		Book book1 = new Book("To Kill a Mockingbird");
		System.out.println("------------------------------------");
		Book book2 = new Book("1984", "George Orwell");
		System.out.println("------------------------------------");
		Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
		System.out.println("------------------------------------");
		System.out.println("==========new========");// 12 Question
	       Shape circle = new Circle(5.0); 
	       Shape rectangle = new Rectangle(4.0, 6.0);
	       
	       circle.calculateArea();
	        rectangle.calculateArea();
	        System.out.println("==========new========");// 13 Question
	        Dog dog = new Dog();
	        
	        dog.sound();
	}

}
