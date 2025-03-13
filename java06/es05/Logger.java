import java.time.LocalTime;

public class Logger {

    public void log(String message) {
        System.out.println(LocalTime.now() + " " + message + "\n");
    }
}
