package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class FactorialRecursive {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();

        System.out.print(factorial(n));
    }
}
