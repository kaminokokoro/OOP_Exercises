package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toUpperCase();
        sc.close();

        System.out.print("The ciphertext string is: ");

        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char outStr = inStr.charAt(charIdx);
            if (outStr >= 65 && outStr <= 87) {
                outStr = (char) ((int) outStr + 3);
            } else if (outStr == 88) {
                outStr = 65;
            } else if (outStr == 89) {
                outStr = 66;
            } else if (outStr == 90) {
                outStr = 67;
            }
            System.out.print(outStr);
        }
    }
}
