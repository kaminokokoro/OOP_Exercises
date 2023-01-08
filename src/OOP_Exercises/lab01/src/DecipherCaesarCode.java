package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void decipherCaeser(String inStr) {
        int strLength = inStr.length();
        for (int charIdx = 0; charIdx < strLength; charIdx++) {
            char outStr = inStr.charAt(charIdx);
            if (outStr >= 68) { //D
                outStr = (char) ((int) outStr - 3);
            } else if (outStr == 65) { //A
                outStr = 88; //X
            } else if (outStr == 66) { //B
                outStr = 89; //Y
            } else if (outStr == 67) { //C
                outStr = 90; // Z
            }
            System.out.print(outStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        String inStr = sc.next().toUpperCase();
        sc.close();

        System.out.print("The plaintext string is: ");
        decipherCaeser(inStr);
    }
}

