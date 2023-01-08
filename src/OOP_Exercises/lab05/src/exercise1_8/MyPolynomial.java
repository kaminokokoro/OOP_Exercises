package OOP_Exercises.lab05.src.exercise1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length;
    }

    public String toString() {
        String res = "";
        for (int degree = coeffs.length - 1; degree >= 0; degree--) {

            if (degree == coeffs.length - 1) {
                res += coeffs[degree] + "x^" + degree;
            } else if (degree == 0) {
                res += " + " + coeffs[degree];
            } else {
                res += " + " + coeffs[degree] + "x^" + degree;
            }
        }
        return res;
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree() - 1; i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree];

        // add this poly to addPoly
        for (int i = 0; i < this.getDegree(); i++) {
            addPolyData[i] += this.coeffs[i];
        }

        // add rightPoly to addPoly
        for (int i = 0; i < right.getDegree(); i++) {
            addPolyData[i] += right.coeffs[i];
        }

        MyPolynomial addPoly = new MyPolynomial(addPolyData);
        return addPoly;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiPolyDegree = this.getDegree() + right.getDegree();
        double[] multiPolyData = new double[multiPolyDegree];
        for (int i = 0; i < this.getDegree(); i++) {
            for (int j = 0; j < right.getDegree(); j++) {
                multiPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        MyPolynomial multiPoly = new MyPolynomial(multiPolyData);
        return multiPoly;
    }
}
