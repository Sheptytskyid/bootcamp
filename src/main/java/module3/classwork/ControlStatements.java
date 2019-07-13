package module3.classwork;

public class ControlStatements {

    public static void main(String[] args) {
        //loops
        System.out.println("for");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }

        System.out.println("while");
        int i = 0;
        while (i < 4) {
            System.out.println(i);
            i++;
        }

        System.out.println("while");
        i = 0;
        do {
            i++;
        } while (i < 4);

    }

    void postAndPreIncrement() {
        int a = 0;
        int b = 0;
        System.out.println(++a);
        System.out.println(b++);

        System.out.println("--------------");
        System.out.println(a);
        System.out.println(b);
    }

    void operationsWithConditionals() {
        //conditional operators
        boolean condition1 = false;
        boolean condition2 = false;

        if (condition1) {
            System.out.println("condition1 is true");
        } else if (condition2) {
            System.out.println("condition2 is true");
        } else if (!condition1) {
            System.out.println("condition1 is false");
        } else {
            System.out.println("other case");
        }

        int a = 17;
        int b = 7;

        if (a == b) {
            System.out.println("a equals b");
        } else if (a > b) {
            System.out.println();
        } else if (a <= b) {
            System.out.println();
        } else if (!(a < b)) {
            System.out.println();
        }

        switch (a) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println(3);
        }

    }
}
