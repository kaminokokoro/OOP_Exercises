package OOP_Exercises.lab12.src.factoryMethod.pseudocode;

public class HTMLDialog extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}
