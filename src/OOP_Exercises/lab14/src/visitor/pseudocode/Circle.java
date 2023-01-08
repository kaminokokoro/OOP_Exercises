package OOP_Exercises.lab14.src.visitor.pseudocode;

public class Circle implements Shape {
    int x;
    int y;
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.printf("[(%d, %d), radius=%d]\n", x, y, radius);
    }

    @Override
    public String accept(Visitor v) {
        return v.visitCircle(this);
    }
}

