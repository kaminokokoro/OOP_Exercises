package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class PrintArrayInStars {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputItems(int num) {
        int[] items = new int[num];
        for (int idx = 0; idx < num; idx++) {
            items[idx] = sc.nextInt();
        }
        return items;
    }

    public static void main(String[] args) {
        final int NUM_ITEMS;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = inputItems(NUM_ITEMS);
        sc.close();

        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
