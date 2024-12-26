package command;

// Command to start the fan
public class FanStartCommand implements Command {
    private Fan fan;

    public FanStartCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }

    @Override
    public void undo() {
        fan.stop();
    }
}