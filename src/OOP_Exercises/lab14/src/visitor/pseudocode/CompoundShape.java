package OOP_Exercises.lab14.src.visitor.pseudocode;


import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    List<Shape> shapes = new ArrayList<>();

    public CompoundShape(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void move(int x, int y) {
        for (Shape shape : shapes) {
            shape.move(x, y);
        }
    }

    private int getX1() {
        if (shapes.size() == 0) {
            return 0;
        }
        int x = 0;
        boolean first = true;
        for (Shape shape : shapes) {
            if (shape instanceof CompoundShape compoundShape) {
                int x1 = compoundShape.getX1();
                if (x > x1 || first) {
                    x = x1;
                    first = false;
                }
            } else if (shape instanceof Circle circle) {
                if (x > circle.x - circle.radius || first) {
                    x = circle.x - circle.radius;
                    first = false;
                }
            } else if (shape instanceof Rectangle rectangle) {
                if (x > rectangle.x || first) {
                    x = rectangle.x;
                    first = false;
                }
            } else if (shape instanceof Dot dot) {
                if (x > dot.x || first) {
                    x = dot.x;
                    first = false;
                }
            }
        }
        return x;
    }

    private int getX2() {
        if (shapes.size() == 0) {
            return 0;
        }
        int x = 0;
        boolean first = true;
        for (Shape shape : shapes) {
            if (shape instanceof CompoundShape compoundShape) {
                int x2 = compoundShape.getX2();
                if (x < x2 || first) {
                    x = x2;
                    first = false;
                }
            } else if (shape instanceof Circle circle) {
                if (x < circle.x - circle.radius || first) {
                    x = circle.x - circle.radius;
                    first = false;
                }
            } else if (shape instanceof Rectangle rectangle) {
                int x2 = rectangle.x + rectangle.width;
                if (x < x2 || first) {
                    x = x2;
                    first = false;
                }
            } else if (shape instanceof Dot dot) {
                if (x < dot.x || first) {
                    x = dot.x;
                    first = false;
                }
            }
        }
        return x;
    }

    private int getY1() {
        if (shapes.size() == 0) {
            return 0;
        }
        int y = 0;
        boolean first = true;
        for (Shape shape : shapes) {
            if (shape instanceof CompoundShape compoundShape) {
                int y1 = compoundShape.getY1();
                if (y < y1 || first) {
                    y = y1;
                    first = false;
                }
            } else if (shape instanceof Circle circle) {
                if (y < circle.y + circle.radius || first) {
                    y = circle.y + circle.radius;
                    first = false;
                }
            } else if (shape instanceof Rectangle rectangle) {
                if (y < rectangle.y || first) {
                    y = rectangle.y;
                    first = false;
                }
            } else if (shape instanceof Dot dot) {
                if (y < dot.y || first) {
                    y = dot.y;
                    first = false;
                }
            }
        }
        return y;
    }

    private int getY2() {
        if (shapes.size() == 0) {
            return 0;
        }
        int y = 0;
        boolean first = true;
        for (Shape shape : shapes) {
            if (shape instanceof CompoundShape compoundShape) {
                int y2 = compoundShape.getY2();
                if (y > y2 || first) {
                    y = y2;
                    first = false;
                }
            } else if (shape instanceof Circle circle) {
                if (y > circle.y - circle.radius || first) {
                    y = circle.y - circle.radius;
                    first = false;
                }
            } else if (shape instanceof Rectangle rectangle) {
                int y2 = rectangle.y - rectangle.height;
                if (y > y2 || first) {
                    y = y2;
                    first = false;
                }
            } else if (shape instanceof Dot dot) {
                if (y > dot.y || first) {
                    y = dot.y;
                    first = false;
                }
            }
        }
        return y;
    }


    @Override
    public void draw() {
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.draw();
            }
        }
        System.out.printf("CompoundShape[(%d, %d), (%d, %d)]\n", getX1(), getY1(), getX2(), getY2());
    }

    @Override
    public String accept(Visitor v) {
        return v.visitCompoundShape(this);
    }
}
