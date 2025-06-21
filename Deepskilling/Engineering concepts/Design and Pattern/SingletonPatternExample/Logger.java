public class Logger {
    private static Logger singleInstance;

    private Logger() {
        System.out.println("Logging in");
    }

    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    public void msg(String message) {
        System.out.println("Log: " + message);
    }
}
