package com.xworks.programs.runner;

import com.xworks.programs.test.Freshers;
import com.xworks.programs.test.Software;

public class JobReqRunner {
	public static void main(String[] args) {
		Software sft = new Freshers();
		sft.addSoftwareDetails();
		sft.addCompanyDetails();
		sft.addSkillsDetails();
		sft.addsalaryDetails();
	}
}
