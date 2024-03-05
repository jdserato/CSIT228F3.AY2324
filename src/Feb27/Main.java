package Feb27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        Object o;

        ThreadSafeCounter tsc = new ThreadSafeCounter();
        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new TSCRunnable(tsc));
        }
        for (Thread t : threads) {
            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//            }
        }
    }
}
