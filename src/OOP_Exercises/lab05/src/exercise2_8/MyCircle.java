package OOP_Exercises.lab05.src.exercise2_8;

import exercise2_6.MyPoint;

public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    public int radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius +
                ", center=" + center + ']';
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
