package OOP_Exercises.lab12.src.factoryMethod.exercises;

public class CallingClass {
    public static void main(String[] args) {
        try {
            FruitFactory factory = new FruitFactory();

            Fruit fruit = factory.provideFruit("apple");
            fruit.produceJuice();

            fruit = factory.provideFruit("orange");
            fruit.produceJuice();

            fruit = factory.provideFruit("banana");
            fruit.produceJuice();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
