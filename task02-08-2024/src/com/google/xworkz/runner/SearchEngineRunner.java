package com.google.xworkz.runner;
import com.google.xworkz.target.Google;
import java.util.Date;
import com.google.xworkz.target.SearchEngine;

public class SearchEngineRunner {

	public static void main(String[] args) {
		SearchEngine engine = new SearchEngine();
		engine.content = "Xworkz";
		engine.developer = "Sundar Pichelal";
		engine.launchYear = 2002;
		engine.version = 9.0;
		
		Google chrome = new Google();
		chrome.developer = "Ganesh";
		chrome.launchYear = 2004;
		chrome.defaultLanguage = "English";
		chrome.maxSearchResults = 100;
		chrome.date = new Date();
		System.out.println("SearchEngine Content is:"+engine.content);
		System.out.println("SearchEngine developer name is:"+engine.developer);
		System.out.println("SearchEngine Launch Yeaar was:"+engine.launchYear);
		System.out.println("SearchEngine Version is:"+engine.version);
		System.out.println("Chrome Developer is:"+chrome.developer);
		System.out.println("Chrome Launch Year is:"+chrome.launchYear);
		System.out.println("Chrome Default Language is:"+chrome.defaultLanguage);
		System.out.println("Chrome Maximum Search Result is:"+chrome.maxSearchResults);
		System.out.println("Chrome Search Date is:"+chrome.date);


	}

}
