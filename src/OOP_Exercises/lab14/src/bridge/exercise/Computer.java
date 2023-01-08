package OOP_Exercises.lab14.src.bridge.exercise;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void startUp();

    public abstract void browseInternet(String url);

    public abstract boolean canMoveComputer();
}
