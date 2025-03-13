public class ExtendingResponsibilityTest {

    public static void main(String[] args) {
        Notifier basicNotifier = new Notifier();
        basicNotifier.send("Hello !");
        System.out.println();
        NotifierDecorator decoratorNotifier = new NotifierDecorator(basicNotifier);
        decoratorNotifier.send("Hello !");
        System.out.println();
        Notifier verboseNotifier = new VerboseNotifier();
        verboseNotifier.send("Hello !");

    }
}