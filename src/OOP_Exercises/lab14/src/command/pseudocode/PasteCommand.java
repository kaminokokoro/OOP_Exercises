package OOP_Exercises.lab14.src.command.pseudocode;

public class PasteCommand extends Command {

    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        if (app.clipboard == null || app.clipboard.isEmpty()) {
            return false;
        }
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }
}