package OOP_Exercises.lab06.src.ex2_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        circle.setRadius(2.0);
        circle.setColor("blue");
        System.out.println(circle);

        cylinder1.setBase(circle);
        System.out.println(cylinder1);

        System.out.println(cylinder1.getArea());
    }
}
