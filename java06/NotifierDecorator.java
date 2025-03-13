import java.time.LocalTime;

public class NotifierDecorator {
    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message + "\n(Sent at : " + (LocalTime.now()) + ")");
    }
}