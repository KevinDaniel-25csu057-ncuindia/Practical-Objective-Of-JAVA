package college.util;

public final class TextUtils {

    private static int successfulNormalizations = 0;

    private TextUtils() {
        // this is to prevent creation of object
    }

    public static String normalizeName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }

        String cleaned = name.strip();

        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (int i = 0; i < cleaned.length(); i++) {

            char ch = cleaned.charAt(i);

            if (Character.isWhitespace(ch)) {

                if (result.length() > 0 &&
                    result.charAt(result.length() - 1) != ' ') {
                    result.append(' ');
                }

                newWord = true;

            } else {

                if (newWord) {
                    result.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }
        }
        successfulNormalizations++;

        return result.toString();
    }

    public static int getSuccessfulNormalizations() {
        return successfulNormalizations;
    }
}