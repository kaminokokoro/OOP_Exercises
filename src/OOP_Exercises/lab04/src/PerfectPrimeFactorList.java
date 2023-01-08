package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int aPosInt = sc.nextInt();
        sc.close();

        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int i = 2; i <= aPosInt; i++) {
            if (isProductOfPrimeFactors(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, (double) count / aPosInt * 100);
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
                product *= i;
                if (product > aPosInt) {
                    return false;
                }
            }
        }
        return product == aPosInt;
    }
}
