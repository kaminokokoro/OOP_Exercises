package OOP_Exercises.lab11.src.com.patterns.strategies.example;

import java.util.List;

public interface FlyBehavior {
    void fly();
    public static void processDucks(List<Duck> ducks) {
        for (Duck duck : ducks) {
            System.out.println("--------------------");
            System.out.println("Name: " + duck.getClass().getName());
            duck.display();
            duck.performQuack();
            duck.performFly();
            duck.swim();
        }
        System.out.println("Done processing ducks\n");
    }
}
