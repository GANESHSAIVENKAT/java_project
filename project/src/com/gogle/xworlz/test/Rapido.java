package com.gogle.xworlz.test;

public class Rapido {

	public String username;
	public int password;
	public int ratings;
	public String toplace;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + password;
		result = prime * result + ratings;
		result = prime * result + ((toplace == null) ? 0 : toplace.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rapido other = (Rapido) obj;
		if (password != other.password)
			return false;
		if (ratings != other.ratings)
			return false;
		if (toplace == null) {
			if (other.toplace != null)
				return false;
		} else if (!toplace.equals(other.toplace))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rapido [username=" + username + ", password=" + password + ", ratings=" + ratings + ", toplace="
				+ toplace + "]";
	}
	
	
}
