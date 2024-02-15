package Jan30;

public class Man extends Human{
    @Override
    public void shave() {
        System.out.println("Shaving my beard");
    }

    public static void sayHello() {
        System.out.println(species + ": Hi");
    }
}
