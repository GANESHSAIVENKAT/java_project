package com.google.xworkz.runner;
import com.google.xworkz.test.Application;
import com.google.xworkz.test.WhatsAppVersion1;
import com.google.xworkz.test.WhatsAppVersion5;

public class ApplicationRunner {

	public static void main(String[] args) {
		Application application=new Application();
		WhatsAppVersion1 info=new WhatsAppVersion1();
		WhatsAppVersion5 detail=new WhatsAppVersion5();
		
		info.appName="WhatsApp";
		info.statusTime=1;
		info.users=10000;
		System.out.println("App Name:"+info.appName);
		System.out.println("Time line of status is:"+info.statusTime);
		System.out.println("Users list:"+info.users);
		detail.voice_msg=true;
		detail.vediocall=true;
		System.out.println("Voice_msg is avaliable?:"+detail.voice_msg);
		System.out.println("Vediocall is avaliable?:"+detail.vediocall);

	}

}
