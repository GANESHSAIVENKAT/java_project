package com.gogle.xworlz.test;

import com.gogle.xworlz.constant.Days;
import com.gogle.xworlz.constant.Months;
import com.gogle.xworlz.constant.Place;
import com.gogle.xworlz.constant.Planet;

public class Earth {

	public Planet planetname;
	public Days names;
	public Months monthname;
	public Place placename;
	
	public Earth() {
		System.out.println("Default");
	}

	@Override
	public int hashCode() {
		final int prime = 10;
		int result = 1;
		result = prime * result + ((monthname == null) ? 0 : monthname.hashCode());
		result = prime * result + ((names == null) ? 0 : names.hashCode());
		result = prime * result + ((placename == null) ? 0 : placename.hashCode());
		result = prime * result + ((planetname == null) ? 0 : planetname.hashCode());
		return result;
	}

	public Earth(Planet planetname, Days names, Months monthname, Place placename) {
		super();
		this.planetname = planetname;
		this.names = names;
		this.monthname = monthname;
		this.placename = placename;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Earth other = (Earth) obj;
		if (monthname != other.monthname)
			return false;
		if (names != other.names)
			return false;
		if (placename != other.placename)
			return false;
		if (planetname != other.planetname)
			return false;
		return true;
		
	}

	@Override
	public String toString() {
		return "Earth [planetname=" + planetname + ", names=" + names + ", monthname=" + monthname + ", placename="
				+ placename + "]";
	}
	
}
