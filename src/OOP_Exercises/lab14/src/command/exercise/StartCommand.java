package OOP_Exercises.lab14.src.command.exercise;

public class StartCommand implements Command {
    private Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}

