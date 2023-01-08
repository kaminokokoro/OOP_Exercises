package OOP_Exercises.lab05.src.exercise2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(1, 4, 1);
        System.out.println(circle1);
        System.out.printf("%.2f\n", circle1.getCircumference());
        System.out.printf("%.2f\n", circle1.getArea());

        MyCircle circle2 = new MyCircle(1, 2, 6);
        System.out.printf("%.2f\n", circle1.distance(circle2));
    }
}
