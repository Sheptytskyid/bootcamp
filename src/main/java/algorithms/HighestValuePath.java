package algorithms;

import java.util.Arrays;

public class HighestValuePath {

    public static void main(String[] args) {
        int[][] input = {
                {0, 1, 0, 1},
                {2, 0, 1, 3},
                {1, 2, 1, 2},
                {2, 0, 1, 1}
        };

        int[][] helper = new int[input.length][input[0].length];
        helper[input.length - 1][0] = input[input.length - 1][0];
        helper(input, helper, input.length - 2, 0);
        helper(input, helper, input.length - 1, 1);
        System.out.println(helper[0][input[0].length - 1]);
        for (int[] i : input) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("--------------");
        for (int[] i : helper) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void helper(int[][] input, int[][] helper, int vpos, int hpos) {
        if (vpos < 0 || hpos >= input[0].length) {
            return;
        } else if (vpos == helper.length - 1) {
            helper[vpos][hpos] = helper[vpos][hpos - 1] + input[vpos][hpos];
            helper(input, helper, vpos - 1, hpos);
            helper(input, helper, vpos, hpos + 1);
        } else if (hpos == 0) {
            helper[vpos][hpos] = helper[vpos + 1][hpos] + input[vpos][hpos];
            helper(input, helper, vpos - 1, hpos);
            helper(input, helper, vpos, hpos + 1);
        } else {
            helper[vpos][hpos] = Math.max(helper[vpos][hpos - 1], helper[vpos + 1][hpos]) + input[vpos][hpos];
            helper(input, helper, vpos - 1, hpos);
            helper(input, helper, vpos, hpos + 1);
        }
    }
}
