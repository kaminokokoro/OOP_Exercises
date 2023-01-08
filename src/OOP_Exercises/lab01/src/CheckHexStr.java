package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class CheckHexStr {
    public static boolean isHexStr(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = sc.next();
        if (isHexStr(inStr)) {
            System.out.println(inStr + " is a hex string");
        } else {
            System.out.println(inStr + " is NOT a hex string");
        }
    }
}
