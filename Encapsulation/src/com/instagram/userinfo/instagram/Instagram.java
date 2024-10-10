package com.instagram.userinfo.instagram;

public class Instagram {
	private String user_name;
    private int no_of_friends;
    private int no_of_posts;


    public Instagram(){
    System.out.println("Instagram Details:");
    }
    public Instagram(String user_name,int no_of_friends, int no_of_posts,int account_created_year, boolean isAccount_active){
    this.user_name = user_name;
    this.no_of_friends = no_of_friends;
    this.no_of_posts = no_of_posts;
 
    }

    public void setUsername(String user_name){
    this.user_name = user_name;
    }
    public String getUsername(){
    return this.user_name;
    }

    public void setNoOfFriends(int no_of_friends){
    this.no_of_friends = no_of_friends;
    }
    public int getNoOfFriends(){
    return this.no_of_friends;
    }

    public void setNoOfPosts(int no_of_posts){
    this.no_of_posts = no_of_posts;
    }
    public int getNoOfPosts(){
    return this.no_of_posts;
    }

    
}
