package Jan30;

public abstract class Human extends Object{
    static String species = "Homo sapiens";
    String name;
    int age;

    public static void sayHello() {
        System.out.println(species + ": Hello");
    }

    public abstract void shave();
}
