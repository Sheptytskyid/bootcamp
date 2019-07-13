package algorythms;

public class QuickFind {

    public static void main(String[] args) {
        int[] array = {5, 9, 8, 2, 0, 1};

        System.out.println(findLowestNumber(array, 3, 0, 5));
    }

    static int findLowestNumber(int[] array, int position, int lo, int hi) {
        if (position >= array.length) {
            return -1;
        }
        int pivot = partition(array, lo, hi);
        if (pivot < position) {
            findLowestNumber(array, position, pivot + 1, hi);
        } else if (pivot > position) {
            findLowestNumber(array, position, lo, pivot - 1);
        }
        return array[position];
    }

    private static int partition(int[] array, int lo, int hi) {
        int counter = lo;
        int temp;
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
