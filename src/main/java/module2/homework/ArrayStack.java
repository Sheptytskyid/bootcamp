package module2.homework;

import java.util.Arrays;

public class ArrayStack {

    private int[] stack = new int[10];
    private int position;

    void addNumber(int number) {
        if (position < 0) {
            System.out.println("Stack is full");
        }

    }

    int removeNumber() {
        if (position > stack.length) {
            System.out.println("stack is empty");
        }

        return 0;
    }

    void printStack() {
        System.out.println(Arrays.toString(stack));
    }
}
