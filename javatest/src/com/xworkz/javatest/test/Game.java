package com.xworkz.javatest.test;

public class Game implements Playable, Runnable{

	@Override
	public void run() {
		  System.out.println("Playing the game");
	}

	@Override
	public void play() {
		  System.out.println("Running the game");
	}

}
