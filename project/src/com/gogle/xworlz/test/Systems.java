package com.gogle.xworlz.test;

public class Systems {

	public String name;
	public String brand;
	public int price;
	public String buyername;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((buyername == null) ? 0 : buyername.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		Systems other = (Systems) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (buyername == null) {
			if (other.buyername != null)
				return false;
		} else if (!buyername.equals(other.buyername))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "System [name=" + name + ", brand=" + brand + ", price=" + price + ", buyername=" + buyername + "]";
	}
	
	
}
