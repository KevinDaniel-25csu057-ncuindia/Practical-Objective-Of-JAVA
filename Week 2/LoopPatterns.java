/* Use nested loops to produce the following patterns for a user-entered size.

Pattern A for size 4:

    * * * *
    * * * *
    * * * *
    * * * *

Pattern B for size 4:

    *
    * *
    * * *
    * * * *

Pattern C for size 4:

    1
    1 2
    1 2 3
    1 2 3 4

Pattern D for size 4:

        * * * *
        * * *
        * *
        *

Pattern E for size 4:

        1
        2 2
        3 3 3
        4 4 4 4

Requirements:

- Complete at least two patterns: one rectangular or triangular star pattern
    and one number pattern.
- Create a separate static method for every completed pattern.
- Each method must receive size as a parameter.
- Reject a size less than 1 in main.
- For each completed pattern, identify the outer-loop responsibility and the
    inner-loop responsibility.
- State the time complexity in terms of size and justify it  */

import java.util.Scanner;
public class LoopPatterns {

    // Pattern B
    public static void patternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern C
    public static void patternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        if (size < 1) {
            System.out.println("Invalid size");
            return;
        }
        System.out.println("\nPattern B:");
        patternB(size);
        System.out.println("\nPattern C:");
        patternC(size);
    }
}