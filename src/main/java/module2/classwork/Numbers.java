package module2.classwork;

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
        flipFirstElement(intArray2);
        flipFirst3Elements(intArray2);

        int[] intArray3 = {11, 12, 13, 15, 16, 17, 18, 19, 20, 21};
        System.out.println(Arrays.toString(intArray2));
        flipFirstElement(intArray3);
        flipFirst3Elements(intArray2);
    }

    static void flipFirstElement(int[] array) {
        int temp = array[array.length  - 1];
        array[array.length  - 1] = array[0];
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }

    static void flipFirst3Elements(int[] array) {
        if (array.length < 6) {
            System.out.println("Array is too small");
        } else {
            int temp0 = array[0];
            int temp1 = array[1];
            int temp2 = array[2];
            array[0] = array[array.length - 1];
            array[1] = array[array.length - 2];
            array[2] = array[array.length - 3];
            array[array.length - 1] = temp0;
            array[array.length - 2] = temp1;
            array[array.length - 3] = temp2;
        }
    }
    
}
