package Mar05;

public class PasswordRunnable implements Runnable{
    char start;
    String pass;
    static boolean isFound;

    public PasswordRunnable(char start, String pass) {
        this.start = start;
        this.pass = pass;
        isFound = false;
    }

    @Override
    public void run() {
        int len = pass.length();
        String atk = start + "a".repeat(len-1);
        while (!atk.equals(pass) && atk.charAt(0) == start && !isFound) {
            System.out.println(atk + " failed");
            // TODO update atk???
            // CONVERT String to Array
            char[] arr = atk.toCharArray();
            int i;
            // aaa
            for (i = 1; arr[len-i] == 'z'; i++) {
                arr[len - i] = 'a';
            }
            arr[len - i] = (char) (arr[len - i] + 1);
            // CONVERT Array to String
            atk = String.valueOf(arr);
        }
        if (atk.equals(pass)) {
            System.out.println("YEHEY " + atk);
            // TODO stop other threads
            isFound = true;
            System.out.println("Found at thread " + start);
        }
    }
}
