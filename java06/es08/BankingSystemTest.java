public class BankingSystemTest {
    public static void main(String[] args) {
        TransactionLogger logger = new TransactionLogger();

        SavingsAccount savingsAccount = new SavingsAccount("SA123", 70000, 0.05);

        CheckingAccount checkingAccount = new CheckingAccount("CA456", 10000, 1000);

        logger.log("Depositing 200 into SavingsAccount");
        savingsAccount.deposit(200);

        logger.log("New SavingsAccount Balance: " + savingsAccount.getBalance());

        logger.log("Withdrawing 600 from CheckingAccount");
        logger.log("Withdrawal successful: " + checkingAccount.withdraw(600));
        logger.log("New CheckingAccount Balance: " + checkingAccount.getBalance());

        logger.log("Applying interst to SavingsAccount");
        savingsAccount.applyInterest();
        logger.log("New SavingsAccount Balance after interest : " + savingsAccount.getBalance());

    }
}