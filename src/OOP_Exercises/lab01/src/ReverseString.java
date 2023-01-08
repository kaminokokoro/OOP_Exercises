package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr;
        int inStrLen;

        System.out.print("Enter a String: ");
        inStr = sc.next();
        sc.close();

        inStrLen = inStr.length();

        System.out.print("The reverse of the String " + '"' + inStr + '"' + " is ");
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
