package algorythms;

import java.util.Arrays;

public class SortClient {

    public static void main(String[] args) {
        int[] unsorted = {8, 4, 6, 7, 1, 5, 9, 0, 2, 6, 3};
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        MergeSort.sort(sorted, 0, 10);
        System.out.println("Merge sort:");
        System.out.println(Arrays.toString(sorted));

        QuickSort.sort(unsorted, 0, 10);
        System.out.println("Quick sort:");
        System.out.println(Arrays.toString(unsorted));
    }
}
