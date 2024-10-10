package com.gogle.xworlz.runner;

import com.gogle.xworlz.test.ChatGpt;

public class ChatGptRunner {

	public static void main(String[] args) {
		ChatGpt chat=new ChatGpt();
		chat.username="Ganesh";
		chat.password="gane12454";
		chat.version="4.5";
		chat.useful=true;
		ChatGpt app=new ChatGpt();
		app.username="Ganesh";
		app.password="gane12454";
		app.version="4.5";
		app.useful=true;
		
		if (chat.equals(app)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int name=chat.hashCode();
		System.out.println("value"+name);
		System.out.println(chat.toString());
		System.out.println(app.toString());
		
	}
}
