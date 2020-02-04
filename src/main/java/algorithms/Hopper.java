package algorithms;

/**
 * @author pla150denshep, 04.02.2020 CRIF IT Solutions Poland
 */
public class Hopper {

    public static void main(String[] args) {
        int[] input = { 4, 2, 0, 0, 2, 0 }; //true
        int[] input1 = { 0, 2, 0, 0, 2, 0 }; //false
        int[] input2 = { 1, 2, 3, 0, 0, 0 }; //false
        int[] input3 = { 1, 2, 3, 0, 0, 1 }; //true
        int[] input4 = { 1}; //true
        int[] input5 = { 0}; //false
        System.out.println("regular");
        System.out.println(isHoppable(input));
        System.out.println(isHoppable(input1));
        System.out.println(isHoppable(input2));
        System.out.println(isHoppable(input3));
        System.out.println(isHoppable(input4));
        System.out.println(isHoppable(input5));
        System.out.println("Recursive");
        System.out.println(isHoppableRecursive(input, input[0], 0));
        System.out.println(isHoppableRecursive(input1, input1[0], 0));
        System.out.println(isHoppableRecursive(input2, input2[0], 0));
        System.out.println(isHoppableRecursive(input3, input3[0], 0));
        System.out.println(isHoppableRecursive(input4, input4[0], 0));
        System.out.println(isHoppableRecursive(input5, input5[0], 0));
    }

    private static boolean isHoppable(int[] input) {
        if (input == null || input.length == 0 || input[0] == 0) {
            return false;
        }
        int capacity = input[0];
        int position = 0;

        while (capacity >= 0) {
            capacity = Math.max(input[position], capacity);
            capacity--;
            position++;
            if (position == input.length && capacity >= 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isHoppableRecursive(int[] input, int capacity, int position) {
        if (input == null || input.length == 0 || input[0] == 0) {
            return false;
        } else if (position >= input.length && capacity >= 0) {
            return true;
        } else if (capacity < 0) {
            return false;
        }
        capacity = Math.max(input[position], capacity);
        return isHoppableRecursive(input, --capacity, ++position);
    }
}
