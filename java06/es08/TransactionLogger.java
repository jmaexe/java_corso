import java.time.LocalTime;

public class TransactionLogger {

    public void log(String message) {
        System.out.println(LocalTime.now() + ": " + message);
    }
}