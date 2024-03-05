package Bank;

public class Account {
    String name;
    double money;

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    synchronized boolean purchase(double amount) {
        if (money >= amount) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            money -= amount;
            assert money >= 0;
            return true;
        }
        return false;
    }
}
