package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class Oct2Dec {
    public static boolean isValidOctalString(String lowerCaseStr) {
        char ch;
        /* Cach 1:
        for (int charIdx = 0; charIdx < lowerCaseStr.length(); charIdx++) {
            ch = lowerCaseStr.charAt(charIdx);
            if (!(ch >= '0' && ch <= '7')) {
                return false;
            }
        }
        return true; */
        //Cach 2: Dung thu vien java
        final String OCTAL_DIGITS = "01234567";
        if (lowerCaseStr == null || lowerCaseStr.length() == 0) {
            return false;
        }
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            if (OCTAL_DIGITS.indexOf(lowerCaseStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    // chuyen 1 ki tu thanh 1 chu so trong he co so 8
    public static int toDigit(char ch) {
        // cach1: dung API hỗ trợ cua java
        // return Character.digit(ch, 8);
        // cach2: cach thu cong
        final String OCTAL_DIGITS = "01234567";
        return OCTAL_DIGITS.indexOf(ch);
    }

    public static int convertOctalToDecimal(String octStr) {
        int decValue = 0;
        if (!isValidOctalString(octStr)) {
            return -1;
        }
       /* int idx = 0;
        int octNum = Integer.parseInt(octStr);
        while (true) {
            if (octNum == 0) {
                break;
            } else {
                int temp = octNum % 10;
                decValue += temp * Math.pow(8, idx);
                octNum = octNum / 10;
                idx++;
            }
        }*/
        for (int i = 0; i < octStr.length(); i++) {
            decValue = decValue * 8 + toDigit(octStr.charAt(i));
        }
        return decValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Octal string: ");
        String inStr = sc.next();
        sc.close();

        if (isValidOctalString(inStr)) {
            System.out.print("The equivalent decimal number " + '"' + inStr + '"' + " is: ");
            System.out.print(convertOctalToDecimal(inStr));
        } else {
            System.out.println("Error: Invalid hexadecimal string " + '"' + inStr + '"');
        }
    }
}
