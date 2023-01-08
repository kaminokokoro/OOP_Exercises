package OOP_Exercises.lab14.src.command.pseudocode;

public class CopyCommand extends Command {

    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.clipboard = editor.getSelection();
        return false;
    }
}