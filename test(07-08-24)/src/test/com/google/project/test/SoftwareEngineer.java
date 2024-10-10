package test.com.google.project.test;

public class SoftwareEngineer extends Employee implements TechnicalSkills{

    public SoftwareEngineer(String name) {
        super(name);
    }
    
    @Override
    public void code() {
        System.out.println("Software Engineer is coding.");
    }
}
