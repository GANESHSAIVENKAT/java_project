package com.gogle.xworlz.test;

public class Whatsapp {
	public String username;
	public int numberoffriends;
	public String password;

	@Override
	public boolean equals(Object object) {

		if (object == null || this == null)	
		return false;
		
		if(this==object)
			return true;
		
		if(!(object instanceof Whatsapp))
			return false;
		
		Whatsapp whatsapp=(Whatsapp)object;
		
		if(numberoffriends!=whatsapp.numberoffriends||this.username.equals(whatsapp.username)||this.password.equals(whatsapp.password))
			return false;
		return true;

	}

}
