package OOP_Exercises.lab11.src.com.patterns.adapter.example;

import java.util.LinkedList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        List<Duck> ducks = new LinkedList<Duck>();
        ducks.add(mallardDuck);
        ducks.add(turkeyAdapter);
        for (Duck duck : ducks) {
            duck.quack();
            duck.fly();
        }
    }
}
