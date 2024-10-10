package test.com.google.project.testrunner;

import test.com.google.project.test.Price;
import test.com.google.project.test.Version;

public class GadgetRunner {

	public static void main(String[] args) {
		
		Version ver=new Version();
		
		ver.version();
		ver.setName();
		ver.name();

		Price p=new Price();
		p.setName();
		p.price();
	}

}
