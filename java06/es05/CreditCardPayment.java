public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private Wallet wallet;

    public CreditCardPayment(String cardNumber, Wallet wallet) {
        this.cardNumber = cardNumber;
        this.wallet = wallet;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Processing credit card payment of " + amount + " using card " + this.cardNumber);
        if (wallet.getBalance() >= amount) {
            wallet.setBalance(wallet.getBalance() - amount);
            return true;
        }
        return false;
    }

}