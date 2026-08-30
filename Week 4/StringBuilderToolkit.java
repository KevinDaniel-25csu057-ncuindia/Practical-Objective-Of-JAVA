import java.util.Scanner;

public class StringBuilderToolkit {

    static String reverse(String text) {
        if (text == null)
            return null;

        StringBuilder builder = new StringBuilder(text);

        builder.reverse();

        return builder.toString();
    }

    static String repeat(String text, int count) {
        if (text == null || count < 0)
            return null;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(text);
        }

        return builder.toString();
    }

    static String joinWords(String[] words, String separator) {
        if (words == null || separator == null)
            return null;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0)
                builder.append(separator);

            builder.append(words[i]);
        }

        return builder.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if (text == null || index < 0 || index >= text.length())
            return null;

        StringBuilder builder = new StringBuilder(text);

        builder.deleteCharAt(index);

        return builder.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {
        if (text == null || index < 0 || index >= text.length())
            return null;

        StringBuilder builder = new StringBuilder(text);

        builder.setCharAt(index, replacement);

        return builder.toString();
    }

    static String buildNumberedList(String[] items) {
        if (items == null)
            return null;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(items[i]);
            builder.append("\n");
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Reverse: " + reverse(text));

        System.out.print("Enter repeat count: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println("Repeated: " + repeat(text, count));

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        System.out.print("Enter separator: ");
        String separator = sc.nextLine();

        System.out.println("Joined: " + joinWords(words, separator));

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.println("After remove: " +
                removeCharacterAt(text, index));

        System.out.print("Enter index to replace: ");
        index = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter replacement character: ");
        char replacement = sc.nextLine().charAt(0);

        System.out.println("After replace: " +
                replaceCharacterAt(text, index, replacement));

        System.out.print("\nEnter number of list items: ");
        int itemsCount = sc.nextInt();
        sc.nextLine();

        String[] items = new String[itemsCount];

        for (int i = 0; i < itemsCount; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            items[i] = sc.nextLine();
        }

        System.out.println("\nNumbered list:");
        System.out.println(buildNumberedList(items));

        // Demonstrating String immutability
        StringBuilder builder = new StringBuilder("Hello");
        String result = builder.toString();

        builder.append(" World");

        System.out.println("String: " + result);
        System.out.println("Builder: " + builder);

        sc.close();
    }
}