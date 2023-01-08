package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class Hex2Dec {
    public static boolean isHexStr(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static int toDigits(char c) {
        // final String HEX_DIGITS = "0123456789ABCDEF";
        // return HEX_DIGITS.indexOf(c);
        return Character.digit(c, 16);
    }

    public static void getDecimal(String hexStr) {
        final String HEX_DIGITS = "0123456789ABCDEF";
        int decNum = 0;

        for (int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            if (isHexStr(hexStr)) {
                decNum = 16 * decNum + HEX_DIGITS.indexOf(hexStr.charAt(charIdx));
            }
        }
        System.out.println(decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String inStr = sc.next();
        String hexStr = inStr.toUpperCase();

        if (isHexStr(hexStr)) {
            System.out.print("The equivalent decimal number for hexadecimal " + '"' + inStr + '"' + " is: ");
            getDecimal(hexStr);
        } else {
            System.out.println("Error: Invalid hexadecimal string " + '"' + inStr + '"');
        }
    }
}
