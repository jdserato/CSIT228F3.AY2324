package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BingoGame implements Runnable{
    List<BingoCard> cards;
    boolean[] result;
    boolean bingo; // shared between threads
    @Override
    public void run() {
        System.out.print("How many players?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        cards = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cards.add(new BingoCard(i+1));
        }
        for (BingoCard card : cards) {
            System.out.println("Card " + card.id);
            System.out.println(card);
        }
        // 3: CHECKERS
        List<Thread> threads = new ArrayList<>();
        for (BingoCard card : cards) {
            threads.add(new Thread(new BingoRowChecker(card, 3)));
        }
        // 2: RANDOM NUMS
        while (!bingo) {
        /*
            - generate a random number num
            - set the result at index num to TRUE
            - outputs the number chosen
            - prints out all numbers chosen numerically in the same line
            - notifies those waiting for result
            - sleeps for 300 milliseconds
         */
        }
    }
}
