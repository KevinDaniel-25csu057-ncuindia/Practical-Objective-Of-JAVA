package college.model;

import college.util.TextUtils;

public class Student extends Person {

    private String name;
    private int mark;

    public Student(String name) {
        this.name = TextUtils.normalizeName(name);
    }

    @Override
    public void describeRole() {
        System.out.println("Student");
    }

    public void submitAssignment() {
        System.out.println("Student submitted assignment");
    }

    public void setMark(int mark) throws InvalidStudentDataException {

        if (mark < 0 || mark > 100) {
            throw new InvalidStudentDataException(
                "Mark must be from 0 to 100"
            );
        }

        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + "}";
    }
}