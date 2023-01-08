package OOP_Exercises.lab05.src.exercise1_1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle[radius = " + radius + " color = " + color + "]";
    }
}

