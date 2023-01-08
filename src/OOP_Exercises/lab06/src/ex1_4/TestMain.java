package OOP_Exercises.lab06.src.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        System.out.println(shape1);

        Rectangle shape2 = new Rectangle(3, 6.5);
        System.out.println(shape2);
        System.out.println("Rectangle: area = " + shape2.getArea() + ", perimeter = " + shape2.getPerimeter());

        Rectangle shape3 = new Square(5.0);
        System.out.println(shape3);
        System.out.println("Area of square: " + shape3.getArea());

        Rectangle shape4 = new Square();
        shape4.setWidth(3.0);
        System.out.println(shape4);

        Rectangle shape5 = new Square();
        shape4.setLength(2.5);
        System.out.println(shape5);
    }
}
