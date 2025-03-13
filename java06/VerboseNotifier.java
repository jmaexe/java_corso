
public class VerboseNotifier extends Notifier {
    @Override
    public void send(String message) {
        super.send(message + "\nLOG: message sent by VerboseNotifier");
    }
}