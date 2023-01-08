package OOP_Exercises.lab06.src.ex1_3;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ(float x, float y, float z) {
        float[] XYZ = {x, y, z};
        return XYZ;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
