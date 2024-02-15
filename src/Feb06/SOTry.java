package Feb06;

import java.util.ArrayList;

public class SOTry {
    public static void main(String[] args) {
        try {
            ArrayList<Animal> animals = new ArrayList<>();
            while (true) {
                animals.add(new Animal());
            }
        }catch (OutOfMemoryError e) {
            System.out.println("HII!~");
        }
        System.out.println("Do you continue?");
    }

    static void infinite() {
        infinite();
    }
}
