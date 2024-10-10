package test.com.google.project.testrunner;

import test.com.google.project.test.Shows;

public class ShowsRunner{
	public static void main(String[] args) {
		
		Shows info=new Shows();
		
		info.movies(); // Output: Method A from InterfaceA
        info.shows();
	}
}
