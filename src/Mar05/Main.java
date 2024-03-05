package Mar05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();
        int len = pass.length();
        String atk = "a".repeat(len);
        System.out.println(atk);
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[26];
        char start = 'a';
        for (int i = 0; i < 26; i++) {
            threads[i] = new Thread(new PasswordRunnable(start, pass));
            start++;
        }
        for (Thread t : threads) {
            t.start();
        }
    }
}
