package com.gogle.xworlz.test;

public class ChatGpt {

	public String username;
	public String password;
	public String version;
	public boolean useful;
	@Override
	public String toString() {
		return "ChatGpt [username=" + username + ", password=" + password + ", version=" + version + ", useful="
				+ useful + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (useful ? 1231 : 1237);
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		ChatGpt other = (ChatGpt) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (useful != other.useful)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	
	
	
}
