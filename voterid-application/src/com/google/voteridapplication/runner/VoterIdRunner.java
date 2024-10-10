package com.google.voteridapplication.runner;
import com.google.voteridapplication.application.VoterId;
public class VoterIdRunner {

	public static void main(String[] args) {
		VoterId voter=new VoterId();
		
		voter.setName("Ganesh");	
		System.out.println(voter.getName());
	}

}
