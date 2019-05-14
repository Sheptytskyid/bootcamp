package module2.homework;

public class ArrayStack {

    int[] stack;
    int position;

    //stack = LIFO
    //[_, _, _, _, _]
    //add 5 [_, _, _, _, 5]
    //add 16 [_, _, _, 16, 5]
    //remove [_, _, _, _, 5] return 16
    //remove [_, _, _, _, _] return 5

    //edge cases
    //adding number to full stack: print an error
    //removing number form an empty stack: print error

    void addNumber(int number) {
        if (position < 0) {
            System.out.println("Stack is full");
        }

    }

    int removeNumber() {
        if ( position > stack.length ) {
            System.out.println("stack is empty");
        }

        return 0;
    }
}
