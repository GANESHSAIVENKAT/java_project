package com.google.xworkz.runner;

import com.google.xworkz.tester.ProjectManager;
import com.google.xworkz.tester.SoftwareEngineer;
import com.google.xworkz.tester.TechnicalProjectManager;

public class SoftwareRunner {

	public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer("Ganesh");
        ProjectManager pm = new ProjectManager("Ramu");
        TechnicalProjectManager tpm = new TechnicalProjectManager("Malli");
        
       
        se.showDetails();  
        se.code();        
        
        pm.showDetails();  
        pm.manage();       
        
        tpm.showDetails(); 
        tpm.code();        
        tpm.manage();  
	}
}
