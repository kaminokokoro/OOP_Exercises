package OOP_Exercises.lab14.src.command.pseudocode;

public class CutCommand extends Command {

    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        if (editor.getSelection().isEmpty()) {
            return false;
        }

        saveBackup();
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }
}