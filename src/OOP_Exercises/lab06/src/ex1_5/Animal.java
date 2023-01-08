package OOP_Exercises.lab06.src.ex1_5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name = " + name + ']';
    }
}
