package com.gogle.xworlz.test;

public class Environment {

	public String season;
	public boolean ispoluted;
	public int tempurature;
	public String air;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((air == null) ? 0 : air.hashCode());
		result = prime * result + (ispoluted ? 1231 : 1237);
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + tempurature;
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
		Environment other = (Environment) obj;
		if (air == null) {
			if (other.air != null)
				return false;
		} else if (!air.equals(other.air))
			return false;
		if (ispoluted != other.ispoluted)
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (tempurature != other.tempurature)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Environment [season=" + season + ", ispoluted=" + ispoluted + ", tempurature=" + tempurature + ", air="
				+ air + "]";
	}
	
	
}
