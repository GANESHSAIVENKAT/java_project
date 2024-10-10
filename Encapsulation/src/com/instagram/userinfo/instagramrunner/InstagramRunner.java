package com.instagram.userinfo.instagramrunner;

import com.instagram.userinfo.instagram.Instagram;

public class InstagramRunner {

	public static void main(String[] args) {
		Instagram insta =new Instagram();
		
		insta.setUsername("Ganesh");
		System.out.println("User Name:"+insta.getUsername());
		
		insta.setNoOfFriends(100);
        System.out.println("Total Friends:"+insta.getNoOfFriends());
        
        insta.setNoOfPosts(20);
        System.out.println("Total post:"+insta.getNoOfPosts());
	}

}
