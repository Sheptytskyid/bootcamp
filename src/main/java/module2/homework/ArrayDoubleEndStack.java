package module2.homework;

import java.util.Arrays;

public class ArrayDoubleEndStack {

    private int[] doubleEndStack = new int[10];
    private int rightPosition;
    private int leftPosition;
    //[______16,| 15_______}
    //[_, _, _,| _, _, _]

    void addLeft(int number) {

    }

    void addRight(int number) {

    }

    int removeLeft() {
        return 0;
    }

    int removeRight() {
        return 0;
    }
    
    void printStack() {
        System.out.println(Arrays.toString(doubleEndStack));
    }
}
