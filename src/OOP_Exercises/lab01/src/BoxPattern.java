package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class BoxPattern {
    public static void drawPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col >= 2 && col <= size - 1 && row >= 2 && row <= size - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == size + 1 - col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col || row == size + 1 - col) {
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

        drawPatternA(size);
        System.out.println();
        drawPatternB(size);
        System.out.println();
        drawPatternC(size);
        System.out.println();
        drawPatternD(size);
    }
}
