package algorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInArray {

    public static void main(String[] args) {
        String text = "GeeksForGeeks"; //5
        String text1 = "GeeksQuiz"; //0
        String text2 = null; //-1
        String text3 = ""; //-1
        String text4 = "aa"; //2
        System.out.println(firstNonRepeatingChar(text));
        System.out.println(firstNonRepeatingChar(text1));
        System.out.println(firstNonRepeatingChar(text2));
        System.out.println(firstNonRepeatingChar(text3));
        System.out.println(firstNonRepeatingChar(text4));
    }

    public static int firstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return -1;
        }
        Map<Character, Integer> count = new HashMap<>();
        text = text.toLowerCase();
        text.chars().forEach(c -> count.merge((char) c, 1, (o, n) -> ++o));
        for (int i = 0; i < text.length(); i++) {
            if (count.get(text.charAt(i)) == 1) {
                return i;
            }
        }
        return text.length();
    }
}
