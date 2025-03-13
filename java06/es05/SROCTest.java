
public class SROCTest {

    public static void main(String[] args) {

        Logger logger = new Logger();
        PaymentProcessor paymentProcessor = new PaymentProcessor(logger);

        Wallet wallet = new Wallet(200);

        PaymentMethod ccPayment = new CreditCardPayment("12341241", wallet);
        paymentProcessor.processPayment(ccPayment, 100);
        PaymentMethod paypalPayment = new PayPalPayment("fafeafae@gmail.com", wallet);
        paymentProcessor.processPayment(paypalPayment, 200);
    }
}