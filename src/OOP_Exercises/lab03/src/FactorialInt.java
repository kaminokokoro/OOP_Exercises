package OOP_Exercises.lab03.src;

public class FactorialInt {
    public static void main(String[] args) {

        System.out.println("Int factorials:");
        printIntFactorials();

        System.out.println("Long factorials:");
        printLongFactorials();
    }

    public static void printIntFactorials() {
        int i = 1;
        int fn = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            fn *= i;
        }
    }

    public static void printLongFactorials() {
        long i = 1L;
        long fn = 1L;
        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Long.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            fn *= i;
        }
    }
}
