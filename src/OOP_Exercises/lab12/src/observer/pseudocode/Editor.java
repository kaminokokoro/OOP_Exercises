package OOP_Exercises.lab12.src.observer.pseudocode;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        events = new EventManager("open", "save");
    }

    public void openFile(String path) {
        this.file = new File(path);
//        System.out.println(path + " " + file.getName());
        events.notify("open", file.getName());
    }

    public void saveFile() throws Exception {
        if (file != null) {
            events.notify("save", file.getName());
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}

