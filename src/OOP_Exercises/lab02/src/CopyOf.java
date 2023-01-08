package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class CopyOf {
    static Scanner sc = new Scanner(System.in);

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            copyArray[idx] = array[idx];
        }
        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copyArray = new int[newLength];
        if (newLength <= array.length) {
            for (int idx = 0; idx < newLength; idx++) {
                copyArray[idx] = array[idx];
            }
        } else {
            for (int idx = 0; idx < newLength; idx++) {
                if (idx < array.length) {
                    copyArray[idx] = array[idx];
                } else {
                    copyArray[idx] = 0;
                }
            }
        }
        return copyArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter the values of original array: ");
        int[] originalArray = new int[size];
        for (int idx = 0; idx < originalArray.length; idx++) {
            originalArray[idx] = sc.nextInt();
        }
        System.out.print("Copy array: ");
        for (int idx = 0; idx < originalArray.length; idx++) {
            System.out.print(copyOf(originalArray)[idx] + " ");
        }
        System.out.println();

        System.out.print("Enter new length: ");
        int newLength = sc.nextInt();
        sc.close();

        System.out.println("Copy array with new length:");
        for (int idx = 0; idx < newLength; idx++) {
            System.out.print(copyOf(originalArray, newLength)[idx] + " ");
        }
    }
}
