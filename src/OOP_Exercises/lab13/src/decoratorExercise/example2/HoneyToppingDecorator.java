package OOP_Exercises.lab13.src.decoratorExercise.example2;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + " + " + addTopping();
    }

    public String addTopping() {
        return "honey";
    }
}
