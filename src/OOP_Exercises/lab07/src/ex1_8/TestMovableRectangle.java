package OOP_Exercises.lab07.src.ex1_8;

public class TestMovableRectangle {
    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(0, 0, 50, 50, 10, 10);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableRectangle(20, 20, 80, 80, 5, 5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
