import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        int add = a + b;
        int sub = a - b;
        int product = a * b;
        int divide = a / b;
        int mod = a % b;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + mod);

        input.close();
    }
}
