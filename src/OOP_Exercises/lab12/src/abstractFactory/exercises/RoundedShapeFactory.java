package OOP_Exercises.lab12.src.abstractFactory.exercises;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        }
        return null;
    }
}

