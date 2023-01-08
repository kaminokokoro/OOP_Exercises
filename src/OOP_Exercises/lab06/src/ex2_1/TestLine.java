package OOP_Exercises.lab06.src.ex2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);

        Point p1 = new Point(2, 3);
        Point p2 = new Point(1, 4);

        Line line2 = new Line(p1, p2);
        System.out.println(line2);
    }
}
