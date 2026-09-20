package college.app;

import college.model.Instructor;
import college.model.Person;
import college.model.Student;
import college.model.InvalidStudentDataException;
import college.util.TextUtils;

public class Week7Lab {

    public static void main(String[] args) {

        // Task 56: Polymorphism and safe casting

        Person[] people = {
            new Student("Asha Nair"),
            new Instructor()
        };

        for (Person person : people) {

            person.describeRole();

            if (person instanceof Student student) {
                student.submitAssignment();
            }

            if (person instanceof Instructor instructor) {
                instructor.conductClass();
            }
        }

        // person.submitAssignment();
        // Compile-time error: Person does not declare submitAssignment().


        // Task 57: Custom exception and recovery

        String[] testMarks = {"85", "abc", "120"};

        for (String text : testMarks) {

            try {
                Student student = new Student("David");

                int mark = Integer.parseInt(text);

                student.setMark(mark);

                System.out.println("Valid: " + student);

            } catch (NumberFormatException exception) {

                System.out.println("Invalid numeric mark: " + text);

            } catch (InvalidStudentDataException exception) {

                System.out.println("Invalid mark: " + exception.getMessage());

            } finally {

                System.out.println("Validation attempt complete");
            }
        }

        System.out.println(
            "Successful normalizations: "
            + TextUtils.getSuccessfulNormalizations()
        );
    }
}