package test.com.google.project.test;

public class Employee {

	
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}
