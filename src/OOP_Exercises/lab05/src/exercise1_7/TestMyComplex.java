package OOP_Exercises.lab05.src.exercise1_7;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex num1 = new MyComplex(1.1, 2.2);
        MyComplex num2 = new MyComplex(3.3, 4.4);
        System.out.println("Enter complex number 1 (real and imaginary part): " + num1.getReal() + "  " + num1.getImag());
        System.out.println("Enter complex number 2 (real and imaginary part): " + num2.getReal() + "  " + num2.getImag());
        System.out.println();
        System.out.println("Number 1 is: " + num1);
        if (!num1.isReal() && !num1.isImaginary()) {
            System.out.println(num1 + " is NOT a pure real number");
            System.out.println(num1 + " is NOT a pure imaginary number");
        }
        System.out.println();

        System.out.println("Number 2 is: " + num2);
        if (!num1.isReal() && !num1.isImaginary()) {
            System.out.println(num2 + " is NOT a pure real number");
            System.out.println(num2 + " is NOT a pure imaginary number");
        }
        System.out.println();

        if (num1.equals(num2)) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is NOT equal to " + num2);
        }

        System.out.println(num1 + " + " + num2 + " = " + num1.addNew(num2));

        MyComplex num3 = new MyComplex(1.1, 2.2);
        MyComplex num4 = new MyComplex(3.3, 4.4);
        System.out.println(num3 + " * " + num4 + " = " + num3.multiply(num4));

        num1.setReal(1.1);
        num1.setImag(2.2);
        num2.setReal(3.3);
        num2.setImag(4.4);
        System.out.println(num1 + " / " + num2 + " = " + num1.divide(num2));
        System.out.println();

        MyComplex num5 = new MyComplex(1.1, 2.2);
        System.out.println(num5.conjugate());
    }
}
