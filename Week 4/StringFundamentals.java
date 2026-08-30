import java.util.Scanner;

public class StringFundamentals {

    static boolean hasText(String value) {
        if (value == null)
            return false;

        return !value.trim().isEmpty();
    }

    static String normalizeCourseCode(String code) {
        if (code == null)
            return null;

        return code.trim().toUpperCase();
    }

    static int countOccurrences(String text, char target) {
        if (text == null)
            return 0;

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target)
                count++;
        }

        return count;
    }

    static int lengthOfLastWord(String text) {
        if (text == null)
            return 0;

        int i = text.length() - 1;

        while (i >= 0 && text.charAt(i) == ' ')
            i--;

        int count = 0;

        while (i >= 0 && text.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    static void reverseString(char[] characters) {
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Has text: " + hasText(text));

        System.out.print("Enter course code: ");
        String code = sc.nextLine();

        System.out.println("Normalized code: " + normalizeCourseCode(code));

        System.out.print("Enter character to count: ");
        char target = sc.nextLine().charAt(0);

        System.out.println("Occurrences: " +
                countOccurrences(text, target));

        System.out.println("Length of last word: " +
                lengthOfLastWord(text));

        char[] characters = text.toCharArray();

        reverseString(characters);

        System.out.println("Reversed: " + new String(characters));

        sc.close();
    }
}