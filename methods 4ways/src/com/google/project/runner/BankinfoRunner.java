package com.google.project.runner;
import com.google.project.task.Bankinfo;
public class BankinfoRunner {

	public static void main(String[] args) {
		Bankinfo info=new Bankinfo();
		int amount[]= {10,50,100,2000,500,10,50,50,10,2000,100,500,500,10,10,50,50,2000,2000};
		info.getinfo(amount);
	}

}
