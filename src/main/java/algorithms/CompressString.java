package algorithms;

public class CompressString {

    public static void main(String[] args) {
        System.out.println(compress(null));
        System.out.println(compress(""));
        System.out.println(compress("a"));
        System.out.println(compress("abcd"));
        System.out.println(compress("aaaaaaaaa"));
        System.out.println(compress("abcaaaaaa"));
    }

    private static String compress(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        if (input.length() == 1) {
            return input;
        }
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
                output.append(input.charAt(i));
                output.append(count);
                count = 0;
            }
        }
        return output.length() < input.length() ? output.toString() : input;
    }
}
