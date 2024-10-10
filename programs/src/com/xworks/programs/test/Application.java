package com.xworks.programs.test;

public class Application implements SocialMedia{

	@Override
	public void addSocialMediaDetails() {
		System.out.println("Running SocialMedia details");
		
	}

	@Override
	public void addInstagramDetails() {
		System.out.println("Applicationname:"+ SocialMedia.name);
		System.out.println("Applicationusers:"+ SocialMedia.users);
		System.out.println("Application active users:"+ SocialMedia.active);
		System.out.println("Application non-active users:"+ SocialMedia.nonactive);
		
	}

}
