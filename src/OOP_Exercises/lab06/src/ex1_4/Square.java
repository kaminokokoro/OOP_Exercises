package OOP_Exercises.lab06.src.ex1_4;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
