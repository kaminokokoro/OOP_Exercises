package OOP_Exercises.lab07.src.ex1_6;

public class TestMain {
    public static void main(String[] args) {
        Animal animal1 = new Cat("cat1");
        animal1.greets();

        Dog dog = new Dog("dog1");
        dog.greets();

        Dog anotherDog = new Dog("another dog");
        dog.greets(anotherDog);

        Dog bigDog = new BigDog("Big dog 1");
        bigDog.greets();

        Dog anotherBigDog = new BigDog("Big dog 2");
        bigDog.greets(anotherBigDog);
    }
}
