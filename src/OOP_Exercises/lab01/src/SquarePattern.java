package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class SquarePattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
