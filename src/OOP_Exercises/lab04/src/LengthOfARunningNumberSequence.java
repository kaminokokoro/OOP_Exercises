package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class LengthOfARunningNumberSequence {
    public static String runningNumber(int n) {
        if (n == 1) {
            return "1";
        }
        return runningNumber(n - 1) + n;
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + (n + "").length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(runningNumber(n));
        System.out.println(len(n));
    }
}
