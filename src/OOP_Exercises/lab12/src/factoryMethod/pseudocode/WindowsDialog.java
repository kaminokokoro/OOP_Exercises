package OOP_Exercises.lab12.src.factoryMethod.pseudocode;

public class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}
