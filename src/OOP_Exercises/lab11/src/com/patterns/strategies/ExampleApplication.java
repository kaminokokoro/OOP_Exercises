package OOP_Exercises.lab11.src.com.patterns.strategies;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int lastNumber = sc.nextInt();
        String action = sc.next();
        sc.close();

        switch (action) {
            case "addition" -> context.setStrategy(new ConcreteStrategyAdd());
            case "subtraction" -> context.setStrategy(new ConcreteStrategySubtract());
            case "multiplication" -> context.setStrategy(new ConcreteStrategyMultiply());
        }
        int result = context.executeStrategy(firstNumber, lastNumber);
        System.out.println(result);
    }
}
