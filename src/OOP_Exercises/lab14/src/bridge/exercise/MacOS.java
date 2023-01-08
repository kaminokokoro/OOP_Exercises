package OOP_Exercises.lab14.src.bridge.exercise;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("MacOS start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge");
    }
}
