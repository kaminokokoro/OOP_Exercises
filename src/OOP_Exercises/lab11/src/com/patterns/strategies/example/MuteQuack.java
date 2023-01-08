package OOP_Exercises.lab11.src.com.patterns.strategies.example;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
