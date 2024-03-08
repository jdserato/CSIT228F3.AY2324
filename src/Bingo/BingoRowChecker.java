package Bingo;

public class BingoRowChecker extends BingoChecker{
    int row;
    public BingoRowChecker(BingoCard card, int row) {
        super(card);
        this.row = row-1;
    }

    @Override
    public void run() {
        for (int col=0; col < 5; col++) {
            int num=0;
            // get the number at this row and col
            synchronized (BingoGame.result) {
                try {
                    BingoGame.result.wait();
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("Card " + card.id + " finishes row " +(row+1));
        System.out.println(card);
    }
}
