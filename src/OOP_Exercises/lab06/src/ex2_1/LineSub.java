package OOP_Exercises.lab06.src.ex2_1;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ", end=" + end + ']';
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        setX(beginX);
    }

    public void setBeginY(int beginY) {
        setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.atan2(yDiff, xDiff);
    }
}
