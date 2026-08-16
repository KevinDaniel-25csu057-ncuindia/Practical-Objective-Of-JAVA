/* Write a program that repeatedly reads marks. Enter -1 to end input. The
sentinel must stop the loop and must not be included as a mark.

After input ends, display:

- number of valid marks entered
- sum of the marks
- average mark
- highest mark
- number of passes (mark >= 50)
- number of failures (mark < 50)

Requirements:

- Use -1 as the sentinel.
- Accept ordinary marks only from 0 through 100.
- Reject an invalid value and continue without including it in any result.
- Avoid division by zero when the first input is -1.
- Use static boolean isValidMark(int mark).
- Use at least two additional methods to print or calculate results.
- Dry-run this input sequence:

            70, 45, 105, 80, -1

Explain which values are processed, which value is rejected, and which value
terminates the loop. */

import java.util.Scanner;
public class MarksProcessor {

    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public static double calculateAverage(int sum, int count) {
        return (double) sum / count;
    }

    public static void printResults(int count, int sum, int highest,
                                    int passes, int failures) {

        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum of marks: " + sum);
        if (count > 0) {
            System.out.println("Average mark: " + calculateAverage(sum, count));
            System.out.println("Highest mark: " + highest);
        }
        else {
            System.out.println("Average mark: 0");
            System.out.println("Highest mark: No marks entered");
        }
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        while (true) {
            System.out.print("Enter mark (-1 to stop): ");
            int mark = sc.nextInt();
            if (mark == -1) {
                break;
            }
            if (!isValidMark(mark)) {
                System.out.println("Invalid mark");
                continue;
            }
            count++;
            sum += mark;
            if (mark > highest) {
                highest = mark;
            }
            if (mark >= 50) {
                passes++;
            }
            else {
                failures++;
            }
        }
        printResults(count, sum, highest, passes, failures);
    }
}