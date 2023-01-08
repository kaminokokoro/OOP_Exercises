package OOP_Exercises.lab14.src.command.pseudocode;

public class Application {
    public String clipboard = "";
    public Editor[] editors;
    public Editor activeEditor;
    public CommandHistory history;

    private Button copyButton;
    private Button cutButton;
    private Button pasteButton;
    private Button undoButton;
    private Shortcut shortcuts;


    public static void main(String[] args) {
        Application app = new Application();
        app.createUI();

        System.out.println("clipboard ban đầu: " + app.clipboard);
        System.out.println("selection ban đầu của editor0: " + app.activeEditor.getSelection());
        app.activeEditor.replaceSelection("Tuan");
        System.out.println("selection của editor0 sau khi chọn \"Tuan\": " + app.activeEditor.getSelection());
        app.copyButton.onClick();
        System.out.println("clipboard sau khi bấm nút copy: " + app.clipboard);
        app.activeEditor = app.editors[1];
        System.out.println("Chuyển sang editor1");
        System.out.println("selection hiện tại của editor1: " + app.activeEditor.getSelection());
        app.pasteButton.onClick();
        System.out.println("selection của editor1 sau khi bấm nút paste: " + app.activeEditor.getSelection());
        app.cutButton.onClick();
        System.out.println("selection của editor1 sau khi bấm nút cut: " + app.activeEditor.getSelection());
        app.undoButton.onClick();
        System.out.println("selection của editor1 sau khi bấm nút undo: " + app.activeEditor.getSelection());
        app.undoButton.onClick();
        System.out.println("selection của editor1 sau khi bấm nút undo: " + app.activeEditor.getSelection());
        app.activeEditor.replaceSelection("Fox");
        System.out.println("selection của editor1 sau khi chọn \"Fox\": " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+C");
        System.out.println("clipboard sau khi bấm tổ hợp phím Ctrl+C: " + app.clipboard);
        app.activeEditor = app.editors[0];
        System.out.println("chuyển sang editor0");
        System.out.println("selection của editor0: " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+V");
        System.out.println("selection của editor0 sau khi bấm tổ hợp phím Ctrl+V: " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+X");
        System.out.println("selection của editor0 sau khi bấm tổ hợp phím Ctrl+X: " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+Z");
        System.out.println("selection của editor0 sau khi bấm tổ hợp phím Ctrl+Z: " + app.activeEditor.getSelection());

    }

    public void createUI() {
        // giả sử mở 2 editor
        editors = new Editor[]{new Editor(), new Editor()};
        activeEditor = editors[0];

        copyButton = new Button();
        cutButton = new Button();
        pasteButton = new Button();
        undoButton = new Button();

        shortcuts = new Shortcut();

        history = new CommandHistory();

        Action copy = () -> executeCommand(new CopyCommand(this, activeEditor));
        copyButton.setCommand(copy);
        shortcuts.onKeyPress("Ctrl+C", copy);

        Action cut = () -> executeCommand(new CutCommand(this, activeEditor));
        cutButton.setCommand(cut);
        shortcuts.onKeyPress("Ctrl+X", cut);

        Action paste = () -> executeCommand(new PasteCommand(this, activeEditor));
        pasteButton.setCommand(paste);
        shortcuts.onKeyPress("Ctrl+V", paste);

        Action undo = () -> executeCommand(new UndoCommand(this, activeEditor));
        undoButton.setCommand(undo);
        shortcuts.onKeyPress("Ctrl+Z", undo);
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
