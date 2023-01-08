package OOP_Exercises.lab06.src.ex2_1;

public class Line {
    private Point begin;
    private Point end;

    // Constructors
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    // Public methods

    @Override
    public String toString() {
        return "Line[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin() {
        this.begin = begin;
    }

    public void setEnd() {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.atan2(yDiff, xDiff);
    }
}
