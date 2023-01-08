package OOP_Exercises.lab07.src.ex1_5;

public class ResizableCircle extends Circle {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + ']';
    }

    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
