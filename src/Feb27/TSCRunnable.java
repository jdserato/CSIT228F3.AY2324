package Feb27;

public class TSCRunnable implements Runnable{
    final ThreadSafeCounter tsc;
    final ThreadSafeCounter[] another;

    public TSCRunnable(ThreadSafeCounter tsc) {
        this.tsc = tsc;
        another = new ThreadSafeCounter[2];
        another[0] = tsc;
    }

    @Override
    public synchronized void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Starting");
        tsc.increment();
        synchronized (tsc) {
            if (tsc.getCount() != 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
                int count = another[0].getCount();
                int answer = 13 / count;
                another[0].reset();
                System.out.println("Reset");
                System.out.println(answer);
            }
        }
    }
}
