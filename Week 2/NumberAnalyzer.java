/* Build one program that reads an integer and produces a small analysis report.
The purpose is to practise designing, calling, and tracing multiple methods.

Create exactly these methods:

        static int readNumber(Scanner input)
        static boolean isEven(int number)
        static boolean isPositive(int number)
        static int absoluteValue(int number)
        static int countDigits(int number)
        static int sumDigits(int number)
        static void printReport(
                        int number,
                        boolean even,
                        boolean positive,
                        int digitCount,
                        int digitSum)

Required flow in main:

1. Create the Scanner.
2. Call readNumber and store the returned number.
3. Call isEven and store its result.
4. Call isPositive and store its result.
5. Call absoluteValue before digit processing.
6. Call countDigits with the absolute value.
7. Call sumDigits with the absolute value.
8. Call printReport with all calculated results.
9. Close the Scanner.

Additional requirements:

- countDigits and sumDigits must each use a loop.
- Treat 0 as a one-digit number.
- Test positive, negative, and zero inputs.
- Draw the active call stack when main calls countDigits.
- Explain why local variables in countDigits are not directly available to
    sumDigits or printReport.

Optional stack-depth extension:

Create static int analyzeMagnitude(int number) that calls absoluteValue and
then countDigits. Trace the deeper call sequence:

        main -> analyzeMagnitude -> absoluteValue
        main -> analyzeMagnitude -> countDigits */

import java.util.Scanner;
public class NumberAnalyzer {

    static int readNumber(Scanner input) {
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

    static int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }

    static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    static void printReport(
            int number,
            boolean even,
            boolean positive,
            int digitCount,
            int digitSum) {
        System.out.println("Number: " + number);
        System.out.println("Even: " + even);
        System.out.println("Positive: " + positive);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = readNumber(input);
        boolean even = isEven(number);
        boolean positive = isPositive(number);
        int absolute = absoluteValue(number);
        int digitCount = countDigits(absolute);
        int digitSum = sumDigits(absolute);
        printReport(number, even, positive, digitCount, digitSum);
        input.close();
    }
}