package com.xworkz.games.Dto;

public class GamesDto {

	private String gamename;
	private String gamesize;
	private byte rating;
	private int totalplayers;
	private String Gamestype;
	
	public GamesDto() {
		
	}

	public GamesDto(String gamename, String gamesize, byte rating, int totalplayers, String gamestype) {
		super();
		this.gamename = gamename;
		this.gamesize = gamesize;
		this.rating = rating;
		this.totalplayers = totalplayers;
		Gamestype = gamestype;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public String getGamesize() {
		return gamesize;
	}

	public void setGamesize(String gamesize) {
		this.gamesize = gamesize;
	}

	public byte getRating() {
		return rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}

	public int getTotalplayers() {
		return totalplayers;
	}

	public void setTotalplayers(int totalplayers) {
		this.totalplayers = totalplayers;
	}

	public String getGamestype() {
		return Gamestype;
	}

	public void setGamestype(String gamestype) {
		Gamestype = gamestype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Gamestype == null) ? 0 : Gamestype.hashCode());
		result = prime * result + ((gamename == null) ? 0 : gamename.hashCode());
		result = prime * result + ((gamesize == null) ? 0 : gamesize.hashCode());
		result = prime * result + rating;
		result = prime * result + totalplayers;
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
		GamesDto other = (GamesDto) obj;
		if (Gamestype == null) {
			if (other.Gamestype != null)
				return false;
		} else if (!Gamestype.equals(other.Gamestype))
			return false;
		if (gamename == null) {
			if (other.gamename != null)
				return false;
		} else if (!gamename.equals(other.gamename))
			return false;
		if (gamesize == null) {
			if (other.gamesize != null)
				return false;
		} else if (!gamesize.equals(other.gamesize))
			return false;
		if (rating != other.rating)
			return false;
		if (totalplayers != other.totalplayers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GamesDto [gamename=" + gamename + ", gamesize=" + gamesize + ", rating=" + rating + ", totalplayers="
				+ totalplayers + ", Gamestype=" + Gamestype + "]";
	}

	
	
}
