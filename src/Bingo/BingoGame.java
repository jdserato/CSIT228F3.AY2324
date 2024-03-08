package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BingoGame implements Runnable{
    List<BingoCard> cards;
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
    }
}
