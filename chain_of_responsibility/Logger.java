package chain_of_responsibility;

// Handler: Logger

public abstract class Logger {
    protected Logger nextLogger;  // Next logger in the chain
    protected int level;          // Severity level of this logger

    // Set the next logger in the chain
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // Log a message based on severity
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);  // Handle the message if this logger is responsible
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);  // Forward the message
        }
    }

    // Abstract method to be implemented by concrete loggers
    protected abstract void write(String message);
}
