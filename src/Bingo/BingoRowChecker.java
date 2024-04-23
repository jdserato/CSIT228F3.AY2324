package Bingo;

public class BingoRowChecker extends BingoChecker{
    int row;
    public BingoRowChecker(BingoCard card, int row) {
        super(card);
        this.row = row-1;
    }

    @Override
    public void run() {
        boolean isNotInterrupted = false;
        for (int col=0; col < 5; col++) {
            // get the number at this row and col
            BingoCell cell = card.nums[row][col];
            isNotInterrupted = waitForMe(cell);
            if (!isNotInterrupted) {
                return;
            }
        }
        System.out.println("Card " + card.id + " finishes row " + (row + 1));

//        System.out.println(card);
    }
}
