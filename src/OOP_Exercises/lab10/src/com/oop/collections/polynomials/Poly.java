package OOP_Exercises.lab10.src.com.oop.collections.polynomials;

public interface Poly {
    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();
}
