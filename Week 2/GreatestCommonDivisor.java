import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int gcd(int first, int second) {

        first = Math.abs(first);
        second = Math.abs(second);

        while (second != 0) {

            int remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("GCD = " + gcd(first, second));
    }
}