package OOP_Exercises.lab06.src.ex1_5;

public class TestMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Meo");
        System.out.println(cat1);
        cat1.greets();

        Dog dog = new Dog("Dog123");
        System.out.println(dog);

        Dog anotherDog = new Dog("another dog");
        dog.greets(anotherDog);
        dog.greets();
    }
}
