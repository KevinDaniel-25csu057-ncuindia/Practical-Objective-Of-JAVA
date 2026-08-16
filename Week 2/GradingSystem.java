/* Write a program that reads a mark and displays:

    80-100    Distinction
    70-79     Merit
    50-69     Pass
    0-49      Fail

Values below 0 or above 100 must display Invalid mark.

Requirements:

- Create static String classifyMark(int mark).
- Return the classification instead of printing it inside the method.
- Test -1, 0, 49, 50, 69, 70, 79, 80, 100, and 101. */

import java.util.Scanner;

public class GradingSystem {

    public static String classifyMark(int mark) {

        if (mark < 0 || mark > 100) {
            return "Invalid mark";
        }
        else if (mark >= 80) {
            return "Distinction";
        }
        else if (mark >= 70) {
            return "Merit";
        }
        else if (mark >= 50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        System.out.println(classifyMark(mark));
    }
}