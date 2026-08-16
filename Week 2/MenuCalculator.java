/* Create a calculator with these menu choices:

    1. Add
    2. Subtract
    3. Multiply
    4. Divide
    0. Exit

Requirements:

- Use do-while so the menu appears at least once.
- Use switch to select the operation.
- Reject invalid menu choices.
- Prevent division by zero.
- Use at least one void method and one value-returning method.
- Use this modular flow in main: printMenu, read/validate choice, read operands,
  call calculate, and display the returned result.
- Continue until the user selects 0. */

import java.util.Scanner;

public class MenuCalculator {

    public static void printMenu() {

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

    public static double calculate(int choice, double num1, double num2) {

        switch (choice) {

            case 1:
                return num1 + num2;

            case 2:
                return num1 - num2;

            case 3:
                return num1 * num2;

            case 4:
                return num1 / num2;

            default:
                return 0;
        }
    }

    public static void run() {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            printMenu();

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice");
                continue;
            }

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            if (choice == 4 && num2 == 0) {
                System.out.println("Cannot divide by zero");
                continue;
            }

            double result = calculate(choice, num1, num2);

            System.out.println("Result: " + result);

        } while (choice != 0);
    }
}