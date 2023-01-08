package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class ArrayToString {
    static Scanner sc = new Scanner(System.in);

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for (int idx = 1; idx < array.length; idx++) {
            sb.append(", ").append(array[idx]);
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter the values of array: ");
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        sc.close();

        System.out.println(arrayToString(array));
    }
}
