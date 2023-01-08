package OOP_Exercises.lab14.src.bridge.exercise;

public class Client {
    public static void main(String[] args) {
        Computer computer = new PC(new WindowsOS());
        computer.startUp();
        computer.browseInternet("fb.com");

        Computer computer1 = new Laptop(new MacOS());
        computer1.startUp();
        computer1.browseInternet("youtube.com");
        if (computer1.canMoveComputer()) {
            System.out.println("Move to another place");
        }
    }
}

