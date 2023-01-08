package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Equals {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        return array;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            int idx = 0;
            while (idx < array1.length) {
                if (array1[idx] != array2[idx]) {
                    return false;
                }
                idx++;
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

        if (equals(array1, array2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
