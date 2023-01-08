package OOP_Exercises.lab11.src.com.patterns.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
