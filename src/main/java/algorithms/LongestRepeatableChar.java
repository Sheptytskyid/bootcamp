package algorithms;

import java.util.Arrays;

public class LongestRepeatableChar {

    public static void main(String[] args) {
        String test1 = null; //[-1, 0]
        String test2 = ""; //[-1, 0]
        String test3 = "a"; //[0, 1]
        String test4 = "aaabbc"; //[0, 3]
        String test5 = "abcd"; //[0, 1]
        String test6 = "abccccd"; //[2, 4]

        System.out.println(Arrays.toString(find(test1)));
        System.out.println(Arrays.toString(find(test2)));
        System.out.println(Arrays.toString(find(test3)));
        System.out.println(Arrays.toString(find(test4)));
        System.out.println(Arrays.toString(find(test5)));
        System.out.println(Arrays.toString(find(test6)));
    }

    public static int[] find(String input) {
        if (input == null || input.length() == 0) {
            return new int[] {-1, 0};
        } else {
            return helper(input, 1, 1, 0, 1);
        }
    }


        public static int[] helper(String input, int pos, int len, int maxpos, int maxlen) {
        if (pos >= input.length()) {
            return new int[] {maxpos, maxlen};
        }
        if (input.charAt(pos) != input.charAt(pos - 1)) {
            if (maxlen < len) {
                maxlen = len;
                maxpos = pos - len;
            }
            len = 0;
        }
            return helper(input, ++pos, ++len, maxpos, maxlen);
        }
}
