package OOP_Exercises.lab13.src.decoratorExercise.example2;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
