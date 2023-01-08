package OOP_Exercises.lab10.src.com.oop.collections.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double i : coeffs) {
            coefficients.add(i);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] poly = new double[coefficients.size()];
        for (int i = 0; i <= poly.length; i++) {
            poly[i] = coefficient(i);
        }
        return poly;
    }
}
