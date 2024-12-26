package command;

public interface Command {
    void execute();
    void undo(); // Optional for supporting undo functionality
}

