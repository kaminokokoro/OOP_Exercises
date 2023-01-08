package OOP_Exercises.lab06.src.ex2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * (2 * base.getRadius() * Math.PI + 2 * base.getArea());
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + base.toString() +
                ", height=" + height +
                ']';
    }

}
