package OOP_Exercises.lab03.src;

import java.util.Scanner;

public class TrigonometricSeries {
    static Scanner sc = new Scanner(System.in);

    public static double sin(double x, int numTerms) {
        double sinX = x;
        int denominator = 1;
        double numerator = x;
        for (int i = 3; i <= (2 * numTerms + 1); i += 2) {
            numerator = numerator * x * x * (-1);
            denominator = denominator * (i - 1) * i;
            sinX += numerator / denominator;
        }
        return Math.round(sinX);
    }

    public static double cos(double x, int numTerms) {
        double cosX = 1;
        double numerator = 1;
        double denominator = 1;
        for (int i = 2; i <= 2 * numTerms; i += 2) {
            numerator = numerator * x * x * (-1);
            denominator = denominator * (i - 1) * i;
            cosX += numerator / denominator;
        }
        return Math.round(cosX);
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter a number: ");
        int numTerms = sc.nextInt();
        sc.close();

        System.out.println("Sin x = " + sin(x, numTerms));
        System.out.println("Cos x = " + cos(x, numTerms));
    }
}
