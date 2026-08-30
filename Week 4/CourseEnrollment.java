import java.util.Scanner;

class Course {
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolledCount;

    public Course(String courseCode, String title, int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be positive");

        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        enrolledCount = 0;
    }

    public boolean enroll() {
        if (isFull())
            return false;

        enrolledCount++;
        return true;
    }

    public boolean withdraw() {
        if (enrolledCount == 0)
            return false;

        enrolledCount--;
        return true;
    }

    public boolean isFull() {
        return enrolledCount == capacity;
    }

    public int getAvailableSeats() {
        return capacity - enrolledCount;
    }

    public String toString() {
        return "Course Code: " + courseCode +
               ", Title: " + title +
               ", Capacity: " + capacity +
               ", Enrolled: " + enrolledCount +
               ", Available: " + getAvailableSeats();
    }
}

public class CourseEnrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course code: ");
        String code = sc.nextLine();

        System.out.print("Enter course title: ");
        String title = sc.nextLine();

        System.out.print("Enter course capacity: ");
        int capacity = sc.nextInt();

        Course course = new Course(code, title, capacity);

        System.out.println("\n" + course);

        System.out.print("\nHow many students do you want to enroll? ");
        int students = sc.nextInt();

        for (int i = 1; i <= students; i++) {
            System.out.println("Enroll student " + i + ": " + course.enroll());
        }

        System.out.println("\n" + course);

        System.out.println("Is course full: " + course.isFull());

        System.out.print("\nDo you want to withdraw a student? (1 = Yes, 0 = No): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Withdrawal successful: " + course.withdraw());
        }

        System.out.println("\n" + course);

        System.out.println("Try withdrawal again: " + course.withdraw());

        sc.close();
    }
}