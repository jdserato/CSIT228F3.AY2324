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
        List<Thread> threads = new ArrayList<>();
        for (BingoChecker checker : checkers) {
            threads.add(new Thread(checker));
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Card " + card.id + " loses");
                for (Thread t2 : threads) {
                    t2.interrupt();
                }
                return;
            }
        }
        BingoGame.bingo = true;
        System.out.println("Card " + card.id + " completes pattern");
        System.out.println(card);
    }
}
