package OOP_Exercises.lab11.src.com.patterns.strategies.example;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
