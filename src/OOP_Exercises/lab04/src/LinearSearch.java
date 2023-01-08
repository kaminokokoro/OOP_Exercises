package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIdx(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();

        if (!linearSearch(array, key)) {
            System.out.println("Element is not present in array");
        } else {
            System.out.print("Element is present at index " + linearSearchIdx(array, key));
        }
    }
}
