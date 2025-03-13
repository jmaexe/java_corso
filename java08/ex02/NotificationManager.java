import java.util.ArrayList;

public class NotificationManager {

    private ArrayList<NotificationSender> notifications;

    public NotificationManager() {
        notifications = new ArrayList<NotificationSender>();
    }

    public void registerSender(NotificationSender sender) {
        notifications.add(sender);

    }

    public void notifyAllSenders(String message) {
        for (NotificationSender sender : notifications) {
            sender.send(message);
        }
    }
}