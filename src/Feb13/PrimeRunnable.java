package Feb13;

public class PrimeRunnable implements Runnable{
    static int ctr = 0;
    int id;
    int start, end;

    public PrimeRunnable(int id, int start, int end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = start; i <= end; i++) {
            // is i prime?
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;

                    break;
                }
            }
            if (isPrime) {
                ctr++;
//                System.out.println("Thread " +id+": " +i + " is prime");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thread " +id+": " +"Prime numbers between " +start +" to " + end + " is " + ctr);
        System.out.println("Total time: " + (endTime-startTime));
    }
}
