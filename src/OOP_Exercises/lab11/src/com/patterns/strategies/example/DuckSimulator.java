package OOP_Exercises.lab11.src.com.patterns.strategies.example;

import java.util.*;

import static com.patterns.strategies.example.FlyBehavior.processDucks;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> ducks = new LinkedList<>();
        Duck myDuck = new RubberDuck();
        ducks.add(new MallardDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(myDuck);

        processDucks(ducks);

        myDuck.setFlyBehavior(new FlyRocketPowered());
        myDuck.setQuackBehavior(new Squeak());
        processDucks(ducks);
    }
}