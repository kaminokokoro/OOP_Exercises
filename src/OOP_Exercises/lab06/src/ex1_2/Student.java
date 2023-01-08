package OOP_Exercises.lab06.src.ex1_2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address) {
        super(name, address);
    }

    public Student(String name, String address, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" +
                super.toString() + ", program=" + program + " year=" + year + " fee=" + fee +
                ']';
    }
}
