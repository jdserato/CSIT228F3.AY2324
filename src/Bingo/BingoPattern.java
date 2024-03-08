package Bingo;

import java.util.ArrayList;
import java.util.List;

public abstract class BingoPattern implements Runnable{
    List<BingoChecker> checkers;
    BingoCard card;

    public BingoPattern(BingoCard card) {
        this.card = card;
        checkers = new ArrayList<>();
    }

    @Override
    public void run() {
        /*
        - creates threads for BingoCheckers
        - starts them all at once
        - waits for all the threads to finish and when done,
            - declare bingo
            - output "Card [id] completes pattern" while
            printing all elements in card form
         */
    }
}
