package Feb13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Until what number? ");
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        System.out.print("How many threads pls? ");
        int numthread = sc.nextInt();
        int each = (int) Math.ceil((double) end / numthread);
        Thread[] threads = new Thread[numthread];
        for (int i = 0; i < numthread; i++) {
            int last = each*(i+1);
            if (i == numthread-1) {
                last = end;
            }
            threads[i] = new Thread(new PrimeRunnable(i+1, each*i+1, last));
        }
        for (int i = 0; i < numthread; i++) {
            threads[i].start();
        }
        for (int i = 0; i < numthread; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Mana si main with a total of " + PrimeRunnable.ctr);
    }
}
