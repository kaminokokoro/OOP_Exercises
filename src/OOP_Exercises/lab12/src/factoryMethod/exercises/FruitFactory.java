package OOP_Exercises.lab12.src.factoryMethod.exercises;

public class FruitFactory {
    Fruit provideFruit(String name) throws Exception {
        switch (name) {
            case "apple" -> new Apple();
            case "orange" -> new Orange();
            case "banana" -> new Banana();
        }
        throw new Exception("No matching fruit could be provided");
    }
}
