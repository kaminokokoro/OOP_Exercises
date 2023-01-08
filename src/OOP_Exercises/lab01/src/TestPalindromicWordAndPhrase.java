package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class TestPalindromicWordAndPhrase {
    public static boolean isPalindromic(String inStr) {
        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        while (fIdx < bIdx) {
            if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
            ++fIdx;
            --bIdx;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String inStr = sc.nextLine();
        sc.close();

        String str = inStr.toLowerCase().replaceAll("[\\s+'.,-]", "");

        if (inStr.contains(" ")) {
            if (isPalindromic(str)) {
                System.out.println(inStr + " is a palindromic phrase");
            } else {
                System.out.println(inStr + " is not a palindromic phrase");
            }
        } else {
            if (isPalindromic(str)) {
                System.out.println(inStr + " is a palindromic word");
            } else {
                System.out.println(inStr + " is not a palindromic word");
            }
        }
    }
}
