package OOP_Exercises.lab06_Homework.src.ex1_5;

public class Country {
    protected String code;
    protected String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return 0;
    }

    public double getArea() {
        return 0.0;
    }

    public double getGdp() {
        return 0.0;
    }
}

