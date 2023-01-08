package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class ExchangeCipher {
    public static void exchangeCipher(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char cipherTextChar = inStr.charAt(charIdx);
            cipherTextChar = (char) (155 - (int) cipherTextChar);
            System.out.print(cipherTextChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toUpperCase();
        sc.close();

        System.out.print("The ciphertext string is: ");
        exchangeCipher(inStr);
    }
}

