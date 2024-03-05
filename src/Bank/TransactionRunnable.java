package Bank;

public class TransactionRunnable implements Runnable{
    Account account;
    double amount;

    public TransactionRunnable(Account account, double amoount) {
        this.account = account;
        this.amount = amoount;
    }

    @Override
    public void run() {
        boolean res = account.purchase(amount);
        System.out.println("Result: " + res);
        System.out.println("Remaining: " + account.money);
    }
}
