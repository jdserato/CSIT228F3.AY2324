package Feb23;

public class PrimeRunnable implements Runnable{
    int start, end;
    static int total_ctr=0;

    public PrimeRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        // TODO count the number of primes from start to end
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                ctr++;
            }
        }
        try {
            System.out.println("Thread sleep for 1 seconds");
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("Primes in " + start + " until " +
                end + ": " + ctr);
        total_ctr += ctr;
    }
}
