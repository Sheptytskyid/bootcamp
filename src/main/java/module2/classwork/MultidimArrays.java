package module2.classwork;

import java.util.Arrays;

public class MultidimArrays {

    public static void main(String[] args) {

        //primitive types
        int a = 3;
        int b = a;

        //reference types
        int[] array = {1,2,3};
        int[] copy = array;

        System.out.println("Primitive types:");
        System.out.println("a is " + a);
        System.out.println("b is "+ b);
        System.out.println("---------------------");
        a = 4;
        System.out.println("a is " + a);
        System.out.println("b is "+ b);


        System.out.println("\nReference types:");
        System.out.println("array is " + Arrays.toString(array));
        System.out.println("copy is " + Arrays.toString(copy));
        System.out.println("---------------------");
        copy[0] = 9;
        System.out.println("array is " + Arrays.toString(array));
        System.out.println("copy is " + Arrays.toString(copy));

    }

    void multidimArrays() {
        int[] oneDimArray = new int[4];


        int[][] twoDimArray = new int[4][];
        twoDimArray[0] = new int[6];
        twoDimArray[1] = new int[1];
        twoDimArray[2] = new int[9];
        twoDimArray[3] = new int[5];

        int[][][] threeDimArray = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}},
                {{9, 10}}
        };
    }
}
