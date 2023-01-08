package OOP_Exercises.lab11.src.com.patterns.strategies;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
