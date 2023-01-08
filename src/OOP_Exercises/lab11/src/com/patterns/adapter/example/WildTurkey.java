package OOP_Exercises.lab11.src.com.patterns.adapter.example;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble Gobble");
    }
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
