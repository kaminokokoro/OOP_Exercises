package OOP_Exercises.lab04.src;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int aPosInt = sc.nextInt();
        sc.close();

        int countPerfects = 0;
        int countNotPerAndDefic = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= aPosInt; i++) {
            if (isPerfect(i)) {
                countPerfects++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n", countPerfects, (double) countPerfects / aPosInt * 100);
        System.out.println("These number are neither deficient nor perfect:");
        for (int i = 1; i <= aPosInt; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                countNotPerAndDefic++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]\n", countNotPerAndDefic, (double) countNotPerAndDefic / aPosInt * 100);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return (sum == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return (sum < aPosInt);
    }
}
