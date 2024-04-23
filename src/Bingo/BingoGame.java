package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BingoGame implements Runnable{
    List<BingoCard> cards;
    static BingoCell[] result;
    static boolean bingo; // shared between threads
    @Override
    public void run() {
        result = new BingoCell[76];
        result[0] = new BingoCell(0);
        result[0].isTrue = true;
        for (int i = 1; i <= 75; i++) {
            result[i] = new BingoCell(i);
        }
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
            threads.add(new Thread(new BingoPatternPlus(card)));
        }
        for (Thread t : threads) {
            t.start();
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
            Random random = new Random();
            int num;
            do {
                num = random.nextInt(75) + 1;
            } while (result[num].isTrue);
            result[num].isTrue = true;
            synchronized (result[num]) {
                result[num].notifyAll();
            }
            for (Thread t : threads) {
                System.out.print(t.getState() + " ");
            }
            System.out.println("Ninggawas " + num);
            for (int i = 1; i <= 75; i++) {
                if (result[i].isTrue) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        for (Thread t : threads) {
            t.interrupt();
        }
    }
}
