package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class Bin2Dec {
    public static boolean isBinary(String binStr) {
        for (int charIdx = 0; charIdx < binStr.length(); charIdx++) {
            char charBin = binStr.charAt(charIdx);
            if (charBin != '0' && charBin != '1') {
                return false;
            }
        }
        return true;
    }

    public static int convertBin2Dec(String binStr) {
        int number = 0;
        for (int charIdx = 0; charIdx < binStr.length(); charIdx++) {
            if (binStr.charAt(charIdx) == '0') {
                continue;
            }
            number += Math.pow(2, (binStr.length() - 1 - charIdx));
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binStr = sc.next();
        sc.close();

        if (isBinary(binStr)) {
            System.out.print("The equivalent decimal number for binary " + binStr + " is: " + convertBin2Dec(binStr));
        } else {
            System.out.println("Error: Invalid binary string " + binStr);
        }
    }
}
