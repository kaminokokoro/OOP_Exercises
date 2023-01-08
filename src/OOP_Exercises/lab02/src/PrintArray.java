package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class PrintArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
            for (int idx = 0; idx < items.length; idx++) {
                items[idx] = sc.nextInt();
            }
        }
        sc.close();

        System.out.print("The values are: ");
        System.out.print("[" + items[0]);
        for (int idx = 1; idx < items.length; idx++) {
            System.out.print(", " + items[idx]);
        }
        System.out.println("]");
    }
}
