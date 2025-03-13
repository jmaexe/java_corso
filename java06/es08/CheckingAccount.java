public class CheckingAccount extends BankAccount {

    private int overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (this.getBalance() < amount) {
            return false;
        }
        this.setBalance(this.getBalance() - amount);
        return true;
    }

}