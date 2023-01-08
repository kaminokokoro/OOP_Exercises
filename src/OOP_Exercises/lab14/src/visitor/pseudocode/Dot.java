package OOP_Exercises.lab14.src.visitor.pseudocode;

public class Dot implements Shape {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }


    @Override
    public void draw() {
        System.out.println("(" + x + ", " + y + ")");
    }

    @Override
    public String accept(Visitor v) {
        return v.visitDot(this);
    }
}
