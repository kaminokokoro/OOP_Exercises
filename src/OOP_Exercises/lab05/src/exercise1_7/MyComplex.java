package OOP_Exercises.lab05.src.exercise1_7;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        setReal(real + right.real);
        setImag(imag + right.imag);
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        setReal(real - right.real);
        setImag(imag - right.imag);
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        setReal(real * right.real - imag * right.imag);
        setImag(real * right.imag + imag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        setReal((real * right.real - imag * (-1) * right.imag) / (right.real * right.real + right.imag * right.imag));
        setImag((real * (-1) * right.imag + imag * right.real) / (right.real * right.real + right.imag * right.imag));
        return this;
    }

    public MyComplex conjugate() {
        setImag(-imag);
        return this;
    }


}
