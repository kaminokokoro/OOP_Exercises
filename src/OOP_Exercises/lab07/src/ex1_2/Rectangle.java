package OOP_Exercises.lab07.src.ex1_2;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
