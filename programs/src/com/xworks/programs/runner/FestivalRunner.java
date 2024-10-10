package com.xworks.programs.runner;

import com.xworks.programs.test.DjRequriments;
import com.xworks.programs.test.Vinayakachavithi;

public class FestivalRunner {

	public static void main(String[] args) {
		DjRequriments festival=new Vinayakachavithi();
		festival.addDjDetails();
		festival.addSpeakerDetails();
		festival.addGeneratorDetails();
		
	}
}
