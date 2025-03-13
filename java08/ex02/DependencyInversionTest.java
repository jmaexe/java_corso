public class DependencyInversionTest {

    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();

        notificationManager.registerSender(new EmailSender());
        notificationManager.registerSender(new SMSSender());

        notificationManager.notifyAllSenders("Your order has been shipped");
    }
}