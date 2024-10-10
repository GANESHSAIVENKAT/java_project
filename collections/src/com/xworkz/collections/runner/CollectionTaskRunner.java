package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTaskRunner {

	public static void main(String[] args) {

		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Srilanka");
		countries.add("USA");
		countries.add("Russia");
		countries.add("Japan");
		countries.add("Germani");
		countries.add("France");
		countries.add("Canada");
		countries.add("Australia");
		countries.add("China");
		countries.add("Italy");
		countries.add("Norway");
		countries.add("South Africa");
		countries.add("Mexico");
		countries.add("Koriea");
		System.out.println(countries);
		Collections.sort(countries);

		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Baahubali");
		movies.add("Magadheera");
		movies.add("Arjun Reddy");
		movies.add("Ala Vaikunthapurramuloo");
		movies.add("Pokiri");
		movies.add("Eega");
		movies.add("Srimanthudu");
		movies.add("Jersey");
		movies.add("Maharshi");
		movies.add("Sye");
		movies.add("Devara");
		movies.add("Ride ");
		movies.add("Ashta Chamma");
		movies.add("Yeto Vellipoyindhi Manasu ");
		movies.add("Hi Nanna");
		System.out.println(movies);
		Collections.sort(movies);
		ArrayList<String> states = new ArrayList<String>();
		states.add("karnataka");
		states.add("Andhrapradesh");
		states.add("Arunachal Pradesh");
		states.add("Assam");
		states.add("Bihar");
		states.add("Jammu&Kashmir");
		states.add("Maharastra");
		states.add("Goa");
		states.add("Kerala");
		states.add("Chennai");
		states.add("Gujarat");
		states.add("Haryana");
		states.add("HimachalPradesh");
		states.add("Jharkhand");
		states.add("Meghalaya");
		System.out.println(states);
		Collections.sort(states);

	}
}
