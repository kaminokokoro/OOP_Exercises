package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Contains {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        return array;
    }

    public static boolean contains(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        System.out.print("Enter array: ");
        int[] array = inputArray(size);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();

        if (contains(array, key)) {
            System.out.println("Array contains the key");
        } else {
            System.out.println("Array not contain the key");
        }
    }
}
