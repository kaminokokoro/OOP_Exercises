package OOP_Exercises.lab07.src.ex1_6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog another) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}
