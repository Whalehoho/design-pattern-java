package chain_of_responsibility;

public class LoggerChain {
    public static Logger getChainOfLoggers() {
        // Create loggers
        Logger infoLogger = new InfoLogger(LogLevel.INFO);
        Logger debugLogger = new DebugLogger(LogLevel.DEBUG);
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger fatalLogger = new FatalLogger(LogLevel.FATAL);

        // Set up the chain: INFO -> DEBUG -> ERROR -> FATAL
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(fatalLogger);

        return infoLogger;  // Return the first logger in the chain
    }
}

