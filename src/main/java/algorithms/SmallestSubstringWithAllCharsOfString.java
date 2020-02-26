package algorithms;

/**
 * Smallest window that contains all characters of string itself
 * Given a string, find the smallest window length with all distinct characters of the given string. For eg. 
 * str = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca” .
 *
 * Examples:
 *
 * Input  : aabcbcdbca
 * Output : dbca
 * Explanation :
 * dbca of length 4 is the smallest
 * window with highest number of distinct
 * characters.
 *
 * Input : aaab
 * Output : ab
 * Explanation :
 * ab of length 2 is the smallest window
 * with highest number of distinct characters.
 */

public class SmallestSubstringWithAllCharsOfString {

    public static void main(String[] args) {
        String str1 = "aabcbcdbca";
        String str2 = "aaab";
        System.out.println(findSubString(str1));
        System.out.println(findSubString(str2));
    }

    private static int findSubString(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        // Count all distinct characters.
        int distinct = ((int) str.chars().distinct().count());

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (++charCount[str.charAt(i)] == 1) {
                count++;
            }

            if (count == distinct) {
                while(charCount[str.charAt(start)] > 1) {
                    charCount[str.charAt(start++)]--;
                }
                minLen = Math.min(minLen, i - start + 1);
            }
        }
        return minLen;
    }
}
