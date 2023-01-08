package OOP_Exercises.lab11.src.com.patterns.strategies;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
