package OOP_Exercises.lab07.src.ex1_1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super.width = side;
        super.length = side;
    }

    public Square(double side, String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setLength(double side) {
        setSide(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ']';
    }
}
