class Student {
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid student ID");
        }

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark");
        }

        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }

    public boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100) {
            return false;
        }

        mark = newMark;
        return true;
    }

    public boolean hasPassed() {
        return mark >= 50;
    }

    public String getClassification() {
        if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public String toString() {
        return "Student{name='" + name + "', studentId='" + studentId
                + "', mark=" + mark + ", classification=" + getClassification() + "}";
    }
}

public class StudentRecord {
    public static void main(String[] args) {

        Student s1 = new Student("Arun", "S101", 49);
        Student s2 = new Student("Bala", "S102", 50);
        Student s3 = new Student("Cathy", "S103", 79);
        Student s4 = new Student("David", "S104", 80);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println("Invalid update: " + s1.setMark(101));
        System.out.println(s1);
    }
}
