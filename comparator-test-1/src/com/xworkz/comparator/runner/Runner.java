package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparator.test.Book;
//
//import com.xworkz.comparator.test.City;
import com.xworkz.comparator.test.City1;
import com.xworkz.comparator.test.Gadget;
import com.xworkz.comparator.test.Movies;
import com.xworkz.comparator.test.Planet;
import com.xworkz.comparator.test.Song;
import com.xworkz.comparator.test.Vehicle;

public class Runner {

	public static void main(String[] args) {
		System.out.println("================Vehicle=========================");

		List<Vehicle> v = new ArrayList<Vehicle>();
		v.add(new Vehicle("Tesla", "Model S", 200));
		v.add(new Vehicle("Ferrari", "488 GTB", 211));
		v.add(new Vehicle("Lamborghini", "Huracan", 202));
		v.add(new Vehicle("Ford", "Mustang", 155));
		Collections.sort(v);
		System.out.println("Sort Ascending Order::" + v);
		System.out.println("==============City===========================");

//		
//        List<City> cities = new ArrayList<City>();
//        cities.add(new City("london", 9000000));
//        cities.add(new City("New York", 8500000));
//        cities.add(new City("Tokyo", 14000000));
//        cities.add(new City("paris", 2100000));
//
//        Collections.sort(cities);
//        System.out.println("Descending order::"+cities);

		List<City1> city = new ArrayList<City1>();
		city.add(new City1("london", 9000000));
		city.add(new City1("New York", 8500000));
		city.add(new City1("Tokyo", 14000000));
		city.add(new City1("paris", 2100000));
		Comparator<City1> cityComparator = new Comparator<City1>() {

			@Override
			public int compare(City1 o1, City1 o2) {

				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(city, cityComparator);
		System.out.println(city);
		System.out.println("================Song=========================");
		List<Song> songs = new ArrayList<Song>();
		songs.add(new Song("Naruto Title", 3.54));
		songs.add(new Song("BlueBird", 2.13));
		songs.add(new Song("OnePiece", 1.25));
		songs.add(new Song("DemonSlayer", 4.31));
		songs.add(new Song("Bleach", 2.77));
		songs.add(new Song("AttackOnTitan", 2.43));

		Comparator<Song> name = Comparator.comparingInt(song -> song.getName().length());
		Comparator<Song> duration = name.thenComparingDouble(Song::getDuration);
		Collections.sort(songs, duration);
		System.out.println(songs);
		System.out.println("===============Movies==========================");
		List<Movies> movies = new ArrayList<>();
		movies.add(new Movies("The Shawshank Redemption", 9.3, 1994));
		movies.add(new Movies("The Godfather", 9.2, 1972));
		movies.add(new Movies("The Dark Knight", 9.0, 2008));
		movies.add(new Movies("12 Angry Men", 9.0, 1957));
		movies.add(new Movies("Schindler's List", 8.9, 1993));

		Comparator<Movies> movieComparator = new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				int ratingComp = Double.compare(o2.getRating(), o1.getRating());
				if (ratingComp == 0)
					return Integer.compare(o1.getReleaseYear(), o2.getReleaseYear());
				else
					return ratingComp;

			}

		};
		Collections.sort(movies, movieComparator);
		System.out.println(movies);
		System.out.println("=================Book========================");

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("The Catcher in the Rye", "B", 1000));
		books.add(new Book("To Kill a Mockingbird", "C", 700));
		books.add(new Book("1984", "F", 100));
		books.add(new Book("Pride and Prejudice", "A", 899));
		Comparator<Book> book1 = Comparator.comparingInt(Book::getB_Price).thenComparing(Book::getAuthor);
		Collections.sort(books, book1);
		System.out.println("array:" + books);
		System.out.println("=================Planet========================");

		List<Planet> planets = new ArrayList<>();
		planets.add(new Planet("Earth", 5.972E24, 12742));
		planets.add(new Planet("Mars", 0.64171E24, 6779));
		planets.add(new Planet("Venus", 4.867E24, 12104));
		planets.add(new Planet("Mercury", null, 4879));
		planets.add(new Planet("Jupiter", 1.898E27, 139820));
		planets.add(new Planet("Saturn", null, 116460));
		Comparator<Planet> massComparator = Comparator.comparing(Planet::getMass,
				Comparator.nullsLast(Double::compareTo));
		Collections.sort(planets, massComparator);
		System.out.println("array:" + planets);
		System.out.println("==================Gadget=======================");

		List<Gadget> gDto = new ArrayList<Gadget>();
		gDto.add(new Gadget("Asus", 85, 18000.00) );
		gDto.add(new Gadget("Iqoo", 85, 8000.00) );
		gDto.add(new Gadget("Realme", 92, 38000.00) );

		Comparator<Gadget> gadget = Comparator.comparingInt(Gadget::getBatteryLife)
				.thenComparing(Gadget::getPrice);
		System.out.println("comparing both bettary and price");
		Collections.sort(gDto, gadget);
		System.out.println(gDto);

	}

}
