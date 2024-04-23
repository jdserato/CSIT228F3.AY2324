package Bingo;

public class BingoColumnChecker extends BingoChecker{
    int col;
    public BingoColumnChecker(BingoCard card, int col) {
        super(card);
        this.col = col-1;
    }

    @Override
    public void run() {
        boolean isNotInterrupted = false;
        for (int row=0; row < 5; row++) {
            // get the number at this row and col
            BingoCell cell = card.nums[row][col];
            if (!waitForMe(cell)) {
                return;
            }
        }
        System.out.println("Card " + card.id + " finishes col " + (col + 1));

//        System.out.println(card);
    }
}
