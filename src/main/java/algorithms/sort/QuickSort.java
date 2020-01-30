package algorithms.sort;

class QuickSort {

    static void sort(int[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int pivot = partition(array, lo, hi);
        sort(array, lo, pivot - 1);
        sort(array, pivot + 1, hi);
    }

    static int partition(int[] array, int lo, int hi) {
        int temp;
        int counter = lo;
        for (int i = lo; i < hi; i++) {
            if (array[i] < array[hi]) {
                temp = array[counter];
                array[counter++] = array[i];
                array[i] = temp;
            }
        }
        temp = array[counter];
        array[counter] = array[hi];
        array[hi] = temp;
        return counter;
    }
}
