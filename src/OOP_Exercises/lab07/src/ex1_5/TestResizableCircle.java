package OOP_Exercises.lab07.src.ex1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle circle1 = new ResizableCircle(3.3);
        System.out.println(circle1);
        circle1.resize(5);
        System.out.println(circle1);
    }
}
