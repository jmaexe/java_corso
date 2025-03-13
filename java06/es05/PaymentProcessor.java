public class PaymentProcessor {
    private Logger logger;

    public PaymentProcessor(Logger logger) {
        this.logger = logger;
    }

    public void processPayment(PaymentMethod paymentMethod, int amount) {
        if (paymentMethod.pay(amount)) {
            logger.log("Payment of " + amount + " processed successfully");
        } else {
            logger.log("Payment of " + amount + " failed.  Insufficient balance");
        }
    }

}