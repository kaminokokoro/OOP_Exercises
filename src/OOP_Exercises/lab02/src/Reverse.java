package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Reverse {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void reverse(int[] array) {
        int fIdx;
        int bIdx;
        int temp;
        for (fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
        printArray(array);
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter the values of array: ");
        int[] array = inputArray(size);
        sc.close();

        System.out.print("Reverse array: ");
        reverse(array);
    }
}
