package OOP_Exercises.lab05.src.exercise2_9;

import exercise2_6.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(1, 2, 3, 4, 0, 1);
        System.out.println(triangle1);
        System.out.printf("%.2f\n", triangle1.getPerimeter());
        System.out.println(triangle1.getType());

        MyPoint point1 = new MyPoint(1, 3);
        MyPoint point2 = new MyPoint(2, 0);
        MyPoint point3 = new MyPoint(-1, 4);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle2);
    }
}
