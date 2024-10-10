package com.xworks.programs.test;

public class AniLovers implements Anime {

	@Override
	public void addAnimeDetails() {
		System.out.println("Running Anime details");
		
	}

	@Override
	public void addNarutoDetails() {
		System.out.println("Animename:"+ Anime.name);
		System.out.println("Totalepisodes:"+ Anime.totalep);
		System.out.println("Moviecount:"+ Anime.moviecount);
		System.out.println("Each episode cost:"+ Anime.episodecost);
		System.out.println("Fancount:"+ Anime.fanscount);
		
		
		
	}

}
