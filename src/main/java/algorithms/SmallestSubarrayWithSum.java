package algorithms;

public class SmallestSubarrayWithSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x  =  51; //3 - {4, 45, 6}

        int[] arr1 = {1, 10, 5, 2, 7};
        int x1  = 9; //1 - {10}

        int[] arr2 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int x2 = 280; //4 - {100, 1, 0, 200}

        int[] arr3 = {1, 2, 4};
        int x3 = 8; //4

        System.out.println(subarrayLen(arr, x));
        System.out.println(subarrayLen(arr1, x1));
        System.out.println(subarrayLen(arr2, x2));
        System.out.println(subarrayLen(arr3, x3));
    }

    /*
    * O(n2)
    */
    public static int subarrayLen(int[] arr, int target) {
        int minLen = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum > target) {
                return 1;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum > target) {
                    minLen = Math.min(minLen, j - i + 1);
                }
            }
        }
        return minLen;
    }
}
