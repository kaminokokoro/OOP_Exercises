package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class HillPattern {
    public static void drawPatternA(int numRows) {
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPatternB(int numRows) {
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (numRows * 2 - (2 * row - 1)); col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void drawPatternC(int numRows) {
        for (int row = 1; row <= numRows * 2 - 1; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if (row <= numRows) {
                    if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if ((row + col <= 3 * numRows - 1) && (row <= col + numRows - 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void drawPatternD(int numRows) {
        for (int row = 1; row <= 2 * numRows - 1; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if (row == 1 || row == 2 * numRows - 1) {
                    System.out.print("# ");
                } else {
                    if (row >= 2 && row <= numRows) {
                        if ((row + col >= numRows + 2) && (row >= col - numRows + 2)) {
                            System.out.print("  ");
                        } else {
                            System.out.print("# ");
                        }
                    } else {
                        if ((row + col <= 3 * numRows - 2) && (row <= col + numRows - 2)) {
                            System.out.print("  ");
                        } else {
                            System.out.print("# ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
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
