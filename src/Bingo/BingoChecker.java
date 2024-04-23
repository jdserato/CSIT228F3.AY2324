package Bingo;

public abstract class BingoChecker implements Runnable{
    BingoCard card;

    public BingoChecker(BingoCard card) {
        this.card = card;
    }

    public boolean waitForMe(BingoCell cell) {
        while (!cell.isTrue) {
            System.out.println("Naghuwat ni " + cell);
            synchronized (cell) {
                try {
                    cell.wait();
                    System.out.println("WAKES UP " + cell.num);
                } catch (InterruptedException e) {
                    System.out.println("COL Stop while waiting for " + cell.num);
                    return false;
                }
            }
        }
        return true;
    }
}
