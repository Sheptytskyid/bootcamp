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

    /*
    * Traverse string twice: first create a counts map <Char, number of occurrences>
    * then traverse string and for each char check if its count in the map is 1
    * return the first char with 1 occurrence
    */
    public static int firstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return -1;
        }
        Map<Character, Integer> count = new HashMap<>();
        text = text.toLowerCase();
        //1st traversal fill the counts map
        text.chars().forEach(c -> count.merge((char) c, 1, (o, n) -> ++o));
        //2nd traversal find the first char in map with value 1
        for (int i = 0; i < text.length(); i++) {
            if (count.get(text.charAt(i)) == 1) {
                return i;
            }
        }
        return text.length();
    }
}
