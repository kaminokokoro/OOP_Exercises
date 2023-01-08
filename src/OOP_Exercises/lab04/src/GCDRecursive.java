package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class GCDRecursive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();

        System.out.print("GCD of " + number1 + " and " + number2 + " is: " + gcd(number1, number2));
    }
}
