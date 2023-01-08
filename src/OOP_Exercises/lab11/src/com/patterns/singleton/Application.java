package OOP_Exercises.lab11.src.com.patterns.singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM DEAN");
        Database bar = Database.getInstance();
        bar.query("SELECT * FROM CLASS");
    }
}
