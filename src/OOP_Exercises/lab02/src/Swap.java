package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Swap {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            System.out.print(array[idx] + " ");
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        int[] temp = new int[array1.length];
        if (array1.length == array2.length) {
            for (int idx = 0; idx < array1.length; idx++) {
                temp[idx] = array1[idx];
                array1[idx] = array2[idx];
                array2[idx] = temp[idx];
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of array 1: ");
        int sizeArray1 = sc.nextInt();
        System.out.print("Enter the values of array 1: ");
        int[] array1 = inputArray(sizeArray1);

        System.out.print("Enter the size of array 2: ");
        int sizeArray2 = sc.nextInt();
        System.out.print("Enter the values of array 2: ");
        int[] array2 = inputArray(sizeArray2);
        sc.close();

        if (swap(array1, array2)) {
            System.out.print("Array 1 after swap: ");
            printArray(array1);
            System.out.println();
            System.out.print("Array 2 after swap: ");
            printArray(array2);
        } else {
            System.out.println("Can not swap, array 1 and array 2 don't have the same length.");
        }
    }
}
