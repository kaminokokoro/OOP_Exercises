package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        for (int col = 1; col <= size + 2; col++) {
            if (col == 1) {
                System.out.print("   *   ");
            } else if (col == 2) {
                System.out.print("|");
            } else {
                System.out.printf("%4d", col - 2);
            }
        }
        System.out.println();

        for (int col = 1; col <= 2 * size + 4; col++) {
            System.out.print("--");
        }
        System.out.println();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size + 2; col++) {
                if (col == 1) {
                    System.out.printf("%4d", row);
                } else if (col == 2) {
                    System.out.print("   |");

                } else {
                    System.out.printf("%4d", row * (col - 2));
                }
            }
            System.out.println();
        }
    }
}
