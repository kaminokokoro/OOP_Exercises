package OOP_Exercises.lab14.src.command.exercise;

public class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}

