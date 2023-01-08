package OOP_Exercises.lab12.src.factoryMethod.pseudocode;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
