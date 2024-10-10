package com.google.project.task;

public class Gaana {
	public static void userinfo(){
		String username = "Ganesh";
	String password = "Ganesh@56536";
	System.out.println("Eneter the user name:"+username);
	if(username!=password){
	System.out.println("Entered correct password:"+password);
	}else{
	System.out.println("Forget Password");
	}
	}
	 public static void premium(int amount,long goldpremium){
		if(amount>=goldpremium){
		System.out.println("You have successfully subscribed:"+amount);
		}else{
		System.out.println("You have not purchase any premium");
		}
	}
	 public static int users(int userinfo) {
		 if(userinfo>900) {
			 return userinfo;
		}else {
			System.out.println("No info provided");
		}
		 return 0;
	 }
	  public static int language(){
		  int languages=35;
		  int num=30;
			if(languages!=num){
			System.out.println("Select languages are:"+languages);
			}else{
			System.out.println("You have not select any language");
			}
				return 30;
		}
}
