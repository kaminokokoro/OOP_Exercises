package OOP_Exercises.lab11.src.com.patterns.strategies.example;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
