package Practica1;

public class Logger {

    private static Logger instance;


    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logInfo(String msg) {
        System.out.println("info "+msg);
    }
    public void logError(String msg) {
        System.out.println("error "+msg);
    }

    public void logWarning(String msg) {
        System.out.println("warning "+msg);
    }


}


