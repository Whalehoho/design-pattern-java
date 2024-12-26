package chain_of_responsibility;

//Concrete Handler: FatalLogger

public class FatalLogger extends Logger {
    public FatalLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FATAL: " + message);
    }
}
