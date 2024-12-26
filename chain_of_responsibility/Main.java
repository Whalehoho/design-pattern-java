package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        // Set up the chain of loggers
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        // Log messages of different severity levels
        System.out.println("Logging an INFO message:");
        loggerChain.logMessage(LogLevel.INFO, "This is an informational message.");

        System.out.println("\nLogging a DEBUG message:");
        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug message.");

        System.out.println("\nLogging an ERROR message:");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error message.");

        System.out.println("\nLogging a FATAL message:");
        loggerChain.logMessage(LogLevel.FATAL, "This is a fatal error message.");
    }
}
