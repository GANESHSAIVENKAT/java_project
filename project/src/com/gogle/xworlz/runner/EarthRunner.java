package com.gogle.xworlz.runner;
import com.gogle.xworlz.constant.Days;
import com.gogle.xworlz.constant.Months;
import com.gogle.xworlz.constant.Place;
import com.gogle.xworlz.constant.Planet;
import com.gogle.xworlz.test.Earth;

public class EarthRunner {

	public static void main(String[] args) {
		Earth earth = new Earth(Planet.EARTH, Days.MONDAY, Months.MARCH, Place.DWARAKA);
		Earth place = new Earth(Planet.MARS, Days.TUESDAY, Months.FEBURARY, Place.VARANASI);

		if (earth.equals(place)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int name=earth.hashCode();
		System.out.println("value"+name);
		System.out.println(earth.toString());
		System.out.println(place.toString());
	}
	
}
