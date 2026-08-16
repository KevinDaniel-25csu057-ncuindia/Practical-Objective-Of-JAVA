/* Write static boolean isPrime(int number), then use it to display whether an
entered integer is prime.

Requirements:

- Values less than 2 are not prime.
- Test possible divisors only while divisor * divisor <= number.
- Test -5, 0, 1, 2, 3, 4, 17, 25, and 97.
- Explain the loop condition */

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {

            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime");
        }
        else {
            System.out.println(number + " is not prime");
        }
    }
}