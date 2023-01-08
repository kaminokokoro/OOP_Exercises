package OOP_Exercises.lab07.src.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(3, 5, 2, 1);
        System.out.println(point1);
        point1.moveDown();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(0, 0, 1, 2, 4, point1);
        System.out.println(circle1);
        circle1.moveUp();
        System.out.println(circle1);
        circle1.moveLeft();
        System.out.println(circle1);
    }
}
