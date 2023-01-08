package OOP_Exercises.lab06.src.ex1_3;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D_1 = new Point2D();
        System.out.println(point2D_1);

        Point3D point3D_1 = new Point3D(1, 3.5f, 4);
        System.out.println(point3D_1);

        System.out.println(" Point3D: " + " x = " + point3D_1.getX()
                + " y = " + point3D_1.getY()
                + " z = " + point3D_1.getZ());
    }
}
