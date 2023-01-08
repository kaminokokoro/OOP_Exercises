package OOP_Exercises.lab14.src.command.exercise;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command command) {
        history.add(command);
        command.execute();
    }
}
