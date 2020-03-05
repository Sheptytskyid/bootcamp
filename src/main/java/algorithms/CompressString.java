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
        output.append(input.charAt(0));
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output.append(count);
                output.append(input.charAt(i));
                count = 1;
            }
        }
        output.append(count);
        return output.length() < input.length() ? output.toString() : input;
    }
}
