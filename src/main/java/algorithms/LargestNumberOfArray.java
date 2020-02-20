package algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberOfArray {

    public static void main(String[] args) {
        int[] arr = {298, 60, 9, 58};
        int[] arr1 = {6};
        int[] arr2 = {};
        System.out.println(Arrays.toString(formLargestNumber(arr)));
        System.out.println(Arrays.toString(formLargestNumber(arr1)));
        System.out.println(Arrays.toString(formLargestNumber(arr2)));
    }

    /**
    * Sorts the array to form the largest possible number if you concat the elements
    * {298, 60, 9, 58 } -> 96058298
    */
    public static Integer[] formLargestNumber(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparing(Object::toString, (a, b) -> (b + a).compareTo(a + b)))
                .toArray(Integer[]::new);
    }
}
