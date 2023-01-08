package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Print {
    static Scanner sc = new Scanner(System.in);

    public static void inputArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = sc.nextInt();
        }
        print(array);
    }

    public static void print(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[idx]);
            } else if (idx == array.length - 1) {
                System.out.print(", " + array[idx]);
            } else {
                System.out.print(", " + array[idx]);
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        inputArray(size);
        sc.close();
    }
}
