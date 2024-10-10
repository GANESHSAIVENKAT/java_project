package com.google.xworkz.tester;

public class TechnicalProjectManager extends SoftwareEngineer implements ManagerialSkills{

    public TechnicalProjectManager(String name) {
        super(name);
    }
    
    @Override
    public void manage() {
        System.out.println("Technical Project Manager is managing the project.");
    }
}
