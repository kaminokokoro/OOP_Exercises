package OOP_Exercises.lab03.src;

import java.util.Scanner;

public class NumberGuess {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        System.out.println(SECRET_NUMBER);
        System.out.println("Key in your guess: ");
        int number = sc.nextInt();
        int idx = 1;
        while (true) {
            if (number == SECRET_NUMBER) {
                System.out.printf("You got it in %d trials!\n", idx);
                break;
            } else if (number < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            number = sc.nextInt();
            sc.close();

            idx++;
        }
    }
}
