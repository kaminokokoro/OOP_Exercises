package OOP_Exercises.lab14.src.command.pseudocode;

public class UndoCommand extends Command{
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}
