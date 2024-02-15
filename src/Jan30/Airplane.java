package Jan30;

public class Airplane implements Flight {
    @Override
    public void fly() {
        System.out.println("Gaining speed...");
        System.out.println("Liftoff!");
    }
}
