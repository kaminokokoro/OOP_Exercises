package OOP_Exercises.lab05.src.exercise2_7;

import exercise2_6.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyLine(int x1, int y1, int x2, int y2) {
        MyPoint begin = new MyPoint(x1, y1);
        this.begin = begin;
        MyPoint end = new MyPoint(x2, y2);
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int[] beginXY = {begin.getX(), begin.getY()};
        return beginXY;
    }

    public void setBeginXY(int x, int y) {
        setBeginX(x);
        setBeginY(y);
    }

    public int[] getEndXY() {
        int[] endXY = {end.getX(), end.getY()};
        return endXY;
    }

    public void setEndXY(int x, int y) {
        setEndX(x);
        setEndY(y);
    }

    public double getLength() {
        return getEnd().distance(getBegin());
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }
}
