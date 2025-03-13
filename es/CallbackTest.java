public class CallbackTest {
    public static void main(String[] args) {
        Publisher pub = new Publisher(
                10);
        Subscriber sub = new Subscriber();
        pub.setSubscriber(sub);
        pub.changeState(
                20);
    }
}
