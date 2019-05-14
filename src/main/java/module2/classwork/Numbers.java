package module2.classwork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Numbers {

    //here we only declare and assign
    int num1;
    int num2 = 4;
    //we don't do any other actions here. We should do actions in methods

    public static void main(String[] args) {
        //[7, 8, 9 ,10]
        //first type of array assignment
        int[] intArray;
        intArray = new int[4];

        intArray[0] = 7;
        intArray[1] = 8;
        intArray[2] = 9;
        intArray[3] = 10;
        System.out.println(Arrays.toString(intArray));

        //second type of array assignment
        int[] intArray2 = {11, 12, 13, 15, 16, 17, 18};
        System.out.println(Arrays.toString(intArray2));
        flipFirstElements(intArray2);

        int[] intArray3 = {11, 12, 13, 15, 16, 17, 18, 19, 20, 21};
        System.out.println(Arrays.toString(intArray2));
        flipFirstElements(intArray3);

    }

    static void flipFirstElements(int[] array) {
        int temp = array[array.length  - 1];
        array[array.length  - 1] = array[0];
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }

    static void flipFirst3Elements(int[] array) {

    }

}
