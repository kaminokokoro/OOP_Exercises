package OOP_Exercises.lab03.src;

import java.util.Scanner;

public class ExponentialSeries {
    static Scanner sc = new Scanner(System.in);

    public static double specialSeries(double x, int numTerms) {
        double result = x;
        for (int k = 1; k < numTerms; k++) {
            double uk = Math.pow(x, 2 * k + 1) / (double) (2 * k + 1);
            for (int i = 2 * k - 1; i > 0; i -= 2) {
                uk *= i / (double) (i + 1);
            }
            result += uk;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = sc.nextDouble();
        int numTerms = sc.nextInt();
        sc.close();

        System.out.print("The sum of series is: " + specialSeries(x, numTerms));
    }
}
