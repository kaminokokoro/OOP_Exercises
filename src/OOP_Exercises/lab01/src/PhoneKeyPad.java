package OOP_Exercises.lab01.src;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inString = sc.next().toLowerCase();
        sc.close();

        for (int charIdx = 0; charIdx < inString.length(); charIdx++) {
            char ch = inString.charAt(charIdx);

            if (ch == 'a' || ch == 'b' || ch == 'c') {
                System.out.print(2);
            } else if (ch == 'd' || ch == 'e' || ch == 'f') {
                System.out.print(3);
            } else if (ch == 'g' || ch == 'h' || ch == 'i') {
                System.out.print(4);
            } else if (ch == 'j' || ch == 'k' || ch == 'l') {
                System.out.print(5);
            } else if (ch == 'm' || ch == 'n' || ch == 'o') {
                System.out.print(6);
            } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
                System.out.print(7);
            } else if (ch == 't' || ch == 'u' || ch == 'v') {
                System.out.print(8);
            } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
                System.out.print(9);
            }
        }
    }
}
