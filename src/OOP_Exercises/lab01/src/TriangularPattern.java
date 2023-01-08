package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class TriangularPattern {
    public static void patternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void patternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row + col) <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void patternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void patternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        patternA(size);
        System.out.println();
        patternB(size);
        System.out.println();
        patternC(size);
        System.out.println();
        patternD(size);
    }
}
