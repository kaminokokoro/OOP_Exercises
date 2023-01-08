package OOP_Exercises.lab05.src.exercise2_7;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 1, 5, 3);
        System.out.println(line1);

        line1.setBeginX(1);
        line1.setBeginY(6);
        System.out.println(line1);

        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
