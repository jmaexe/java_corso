public class Singleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message.");
        System.out.println("Both references are the same " + (logger1 == logger2));
    }
}
