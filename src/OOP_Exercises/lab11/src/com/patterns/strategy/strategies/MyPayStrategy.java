package OOP_Exercises.lab11.src.com.patterns.strategy.strategies;

import com.patterns.strategies.PayStrategy;

public class MyPayStrategy {
    private static MyPayStrategy instance;
    private PayStrategy payStrategy;
    private MyPayStrategy() {

    }
    public static MyPayStrategy getInstance() {
        if (instance == null) {
            instance = new MyPayStrategy();
        }
        return instance;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean pay(int paymentAmount) {
        return payStrategy.pay(paymentAmount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }
}
