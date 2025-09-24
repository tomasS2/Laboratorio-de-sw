package loggingutils;

public class Logger {

    private static Logger instance;
    private static final java.util.logging.Logger loggerNuevo = java.util.logging.Logger.getLogger("Logger");;


    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logInfo(String msg) {
        loggerNuevo.info(msg);
    }
    public void logError(String msg) {
        loggerNuevo.severe(msg);
    }

    public void logWarning(String msg) {
        loggerNuevo.warning(msg);
    }


}


