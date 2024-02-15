package Feb13;

public class NamedThread extends Thread {
    String name;

    public NamedThread(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello! This is thread " + name);
    }
}
