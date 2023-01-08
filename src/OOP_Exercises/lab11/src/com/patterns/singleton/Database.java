package OOP_Exercises.lab11.src.com.patterns.singleton;

public class Database {
    private static Database instance;
    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("execute " + sql);
    }
}
