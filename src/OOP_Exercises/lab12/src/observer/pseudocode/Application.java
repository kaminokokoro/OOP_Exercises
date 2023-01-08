package OOP_Exercises.lab12.src.observer.pseudocode;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LoggingListener logger = new LoggingListener("log.txt", "Someone has opened the file: %s");
        EmailAlertsListener email = new EmailAlertsListener("admin2@example.com", "The file has been opened: %s");
        editor.events.subscribe("open", logger);
        editor.events.subscribe("open", email);

        LoggingListener loggingListener = new LoggingListener("log_save.txt", "someone save your file");
        EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlerts);
        editor.events.subscribe("save", loggingListener);

        editor.openFile("test.txt");
        editor.openFile("haha.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

