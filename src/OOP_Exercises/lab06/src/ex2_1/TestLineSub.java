package OOP_Exercises.lab06.src.ex2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(1, 2, 3, 4);
        System.out.println(lineSub1);
        lineSub1.getLength();
        lineSub1.getGradient();
        lineSub1.setBeginXY(5, 4);
        System.out.println(lineSub1);

        Point p1 = new Point(9, 3);
        Point p2 = new Point(1, 8);

        LineSub lineSub2 = new LineSub(p1, p2);
        System.out.println(lineSub2);
    }
}
