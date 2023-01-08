package OOP_Exercises.lab14.src.bridge.exercise;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}


