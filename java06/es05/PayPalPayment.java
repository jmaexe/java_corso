public class PayPalPayment implements PaymentMethod {
    private String email;
    private Wallet wallet;

    public PayPalPayment(String email, Wallet wallet) {
        this.wallet = wallet;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String getEmail() {
        return email;
    }

    public Wallet getWallet() {
        return wallet;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Processing PayPal payment " + amount + " for email : " + this.email);
        if (wallet.getBalance() >= amount) {
            wallet.setBalance(wallet.getBalance() - amount);
            return true;
        }
        return false;
    }

}