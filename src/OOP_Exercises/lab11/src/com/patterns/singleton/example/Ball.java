package OOP_Exercises.lab11.src.com.patterns.singleton.example;

public class Ball {
    private static Ball ball;
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public void bounce() {
        System.out.println("Boing!");
    }

    public static Ball getInstance(String color) {
        if (ball == null) {
            ball = new Ball(color);
        }
        return ball;
    }
}
