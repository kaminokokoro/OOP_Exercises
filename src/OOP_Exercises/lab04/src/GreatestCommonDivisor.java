package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        sc.close();

        System.out.print("GCD of " + number1 + " and " + number2 + " is: " + gcd(number1, number2));
    }

    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
