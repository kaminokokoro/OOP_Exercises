package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void countDigits(String inStr) {
        int count = 0;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char c = inStr.charAt(charIdx);
            if (c >= '0' && c <= '9') {
                count += 1;
            }
        }
        System.out.printf("Number of digits: %d (%.2f%%) \n", count, (double) count / inStr.length() * 100);
    }

    public static void countVowels(String inString) {
        int count = 0;
        String instring = inString.toLowerCase();
        for (int charIdx = 0; charIdx < inString.length(); charIdx++) {
            char c = instring.charAt(charIdx);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count += 1;
            }
        }
        System.out.printf("Number of vowels: %d (%.2f%%)", count, (double) count / inString.length() * 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inString = sc.next();
        sc.close();

        countVowels(inString);
        countDigits(inString);
    }
}
