package OOP_Exercises.lab13.src.decoratorExercise.example2;

public class DecoratorDemo {
    public static void main(String[] args) {
        IceCream vanillaIceCreamWithHoney = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(vanillaIceCreamWithHoney.getDescription());

        IceCream strawberryCreamWithNuts = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(strawberryCreamWithNuts.getDescription());

        IceCream chocolateIceCreamWithHoneyAndNuts = new NutsToppingDecorator(new HoneyToppingDecorator(new ChocolateIceCream()));
        System.out.println(chocolateIceCreamWithHoneyAndNuts.getDescription());
    }
}
