package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Exponent {
    static Scanner sc = new Scanner(System.in);

    public static int exponent(int base, int exp) {
        int product = 1;

        for (int idx = 0; idx < exp; idx++) {
            product *= base;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        sc.close();

        if (exp < 0) {
            System.out.println("Error! Exponent must be a non-negative integer!");
        } else {
            System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
        }

    }
}
