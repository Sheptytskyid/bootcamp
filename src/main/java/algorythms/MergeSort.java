package algorythms;

class MergeSort {

    static void sort(int[] array, int low, int hi) {
        if (hi <= low) {
            return;
        }
        int mid = (low + hi) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, hi);
        merge(array, low, mid, hi);
    }

    private static void merge(int[] array, int low, int mid, int hi) {
        int lengthLeft = mid - low + 1;
        int lengthRight = hi - mid;

        int[] left = new int[lengthLeft];
        int[] right = new int[lengthRight];

        System.arraycopy(array, low, left, 0, lengthLeft);
        System.arraycopy(array, mid + 1, right, 0, lengthRight);

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < hi + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                array[i] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            } else if (leftIndex < lengthLeft) {
                array[i] = left[leftIndex++];
            } else if (rightIndex < lengthRight) {
                array[i] = right[rightIndex++];
            }
        }
    }
}
