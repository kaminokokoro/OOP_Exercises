package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Search {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        return array;
    }

    public static int search(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        System.out.print("Enter array: ");
        int[] array = inputArray(size);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();

        System.out.println("The index of key in array is: " + search(array, key));
    }
}
