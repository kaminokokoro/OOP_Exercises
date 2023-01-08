package OOP_Exercises.lab06.src.ex1_1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * (2 * getRadius() * Math.PI + 2 * super.getArea());
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height = " + height;
    }
}
