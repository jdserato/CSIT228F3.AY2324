package Feb13;

public class NamedRunnable implements Runnable{
    String name;

    public NamedRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Hello! This is thread " + name);
    }
}
