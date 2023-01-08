package OOP_Exercises.lab12.src.observer.pseudocode;

import java.io.File;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String log_filename, String message) {
        log = new File(log_filename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("write to " + log.getName() + ": \"" + newMessage + "\"");
    }
}

