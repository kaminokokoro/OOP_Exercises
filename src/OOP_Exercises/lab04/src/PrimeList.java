package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the upper bound: ");
        int aPosInt = sc.nextInt();
        sc.close();

        int countPrimes = 0;
        for (int i = 1; i <= aPosInt; i++) {
            if (isPrime(i)) {
                countPrimes++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d primes found (%.2f%%)]", countPrimes, (double) countPrimes / aPosInt * 100);

    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
