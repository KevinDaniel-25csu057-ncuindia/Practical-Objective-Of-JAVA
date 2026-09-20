package college.model;

public class Instructor extends Person {

    @Override
    public void describeRole() {
        System.out.println("Instructor");
    }

    public void conductClass() {
        System.out.println("Instructor conducting class");
    }
}