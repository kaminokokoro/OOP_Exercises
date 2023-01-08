package OOP_Exercises.lab11.src.com.patterns.strategy.order;

import com.patterns.strategies.PayStrategy;
import com.patterns.strategy.strategies.MyPayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(MyPayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
