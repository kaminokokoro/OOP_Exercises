package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        int decNum, remainder;
        String hexStr = "";

        final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        decNum = in.nextInt();
        in.close();

        while (decNum > 0) {
            remainder = decNum % 16;
            hexStr = hexDigits[remainder] + hexStr;
            decNum = decNum / 16;
        }
        System.out.println("The equivalent hexadecimal number is: " + hexStr);
    }
}
