package com.gogle.xworlz.test;

public class Product {

	public String prdname;
	public int price;
	public int rating;
	public String buyername;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyername == null) ? 0 : buyername.hashCode());
		result = prime * result + ((prdname == null) ? 0 : prdname.hashCode());
		result = prime * result + price;
		result = prime * result + rating;
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
		Product other = (Product) obj;
		if (buyername == null) {
			if (other.buyername != null)
				return false;
		} else if (!buyername.equals(other.buyername))
			return false;
		if (prdname == null) {
			if (other.prdname != null)
				return false;
		} else if (!prdname.equals(other.prdname))
			return false;
		if (price != other.price)
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [prdname=" + prdname + ", price=" + price + ", rating=" + rating + ", buyername=" + buyername
				+ "]";
	}
	
	
}
