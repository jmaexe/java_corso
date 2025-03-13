import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;

    public void log(String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime + " - " + message);
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}