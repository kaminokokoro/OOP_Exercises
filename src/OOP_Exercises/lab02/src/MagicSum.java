package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class MagicSum {
    static Scanner sc = new Scanner(System.in);

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8)
                return true;
            number = number / 10;
        }
        return false;
    }

    public static int calMagicSum(int number) {
        final int SENTINEL = -1;
        int magicSum = 0;
        while (number != SENTINEL) {
            if (hasEight(number)) {
                magicSum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
        }
        return magicSum;
    }

    public static void main(String[] args) {
        int number;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = sc.nextInt();

        System.out.println("The magic sum is: " + calMagicSum(number));
        sc.close();
    }
}
