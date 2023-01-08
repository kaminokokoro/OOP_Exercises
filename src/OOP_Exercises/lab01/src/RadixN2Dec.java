package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class RadixN2Dec {
    static Scanner sc = new Scanner(System.in);

    public static boolean isValidString(String inStr, int radix) {
        if (inStr == null || inStr.length() == 0) {
            return false;
        }
        char ch;
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            if (Character.digit(ch, radix) == -1) {
                return false;
            }

        }
        return true;
    }

    public static int toDigit(char ch, int radix) {
        return Character.digit(ch, radix);
    }

    public static int convertRadixNToDecimal(String inString, int radix) {
        if (!isValidString(inString, radix)) {
            return -1;
        }
        int decValue = 0;
        for (int i = 0; i < inString.length(); i++) {
            decValue = decValue * radix + toDigit(inString.charAt(i), radix);
        }
        return decValue;
    }

    public static void main(String[] args) {
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();

        System.out.print("Enter the string: ");
        String inStr = sc.next();
        sc.close();

        System.out.print("The equivalent decimal number " + inStr + " is: " + convertRadixNToDecimal(inStr, radix));

    }
}
