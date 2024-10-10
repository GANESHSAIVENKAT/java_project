package com.google.xworkz.tester;
public class ProjectManager extends Employee implements ManagerialSkills{

    public ProjectManager(String name) {
        super(name);
    }
    
    @Override
    public void manage() {
        System.out.println("Project Manager is managing the project.");
    }
}
