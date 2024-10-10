package test.com.google.project.testrunner;

import test.com.google.project.test.ProjectManager;
import test.com.google.project.test.SoftwareEngineer;
import test.com.google.project.test.TechnicalProjectManager;

public class HybridInheritanceExample {

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
