package Feb23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Until what number: ");
        int max = sc.nextInt();
        System.out.print("How many threads: ");
        int thrcnt = sc.nextInt();
        // Delegate threads
        int items = (int) Math.ceil((double) max / thrcnt);
        Thread[] threads = new Thread[thrcnt];
        for (int i = 0; i < thrcnt; i++) {
            int first = items * i + 1;
            int last = items * (i + 1);
            threads[i] = new Thread(new PrimeRunnable(first, last)) ;
//            System.out.println("IsAlive? " + threads[i].isAlive());
        }
        for (int i = 0; i < thrcnt; i++) {
            System.out.println("b4 IsAlive? " + threads[i].isAlive());
            threads[i].start();
            System.out.println("af IsAlive? " + threads[i].isAlive());
        }
        try {
            System.out.println("Sleeping for 2 seconds");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        for (int i = 0; i < thrcnt; i++) {
            threads[i].interrupt();
        }
        for (int i = 0; i < thrcnt; i++) {
            try {
                System.out.println("JOINING THREAD " + i);
                System.out.println(i + " b4 IsAlive? " + threads[i].isAlive());
                threads[i].join(6356);
                System.out.println(i + " af IsAlive? " + threads[i].isAlive());
            } catch (InterruptedException e) {
            }
        }
        System.out.println("TOTAL PRIMES: " + PrimeRunnable.total_ctr);
    }
}
