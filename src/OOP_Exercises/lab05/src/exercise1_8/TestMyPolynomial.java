package OOP_Exercises.lab05.src.exercise1_8;

public class TestMyPolynomial {
    public static void main(String[] args) {
        double[] coeffs = {1.1, 2.2, 3.3, 4.4};
        MyPolynomial polynomial1 = new MyPolynomial(coeffs);
        System.out.println(polynomial1);
        System.out.printf("%.2f\n", polynomial1.evaluate(3.0));

        MyPolynomial polynomial2 = new MyPolynomial(coeffs);
        System.out.println(polynomial1.add(polynomial2));

        System.out.println(polynomial2.multiply(polynomial2));
    }
}
