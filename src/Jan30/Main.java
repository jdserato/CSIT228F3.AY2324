package Jan30;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jan30.ArrayList list = new Jan30.ArrayList();
        list.add(5);




        Account acc = new Account("Vince", 1);
        Account dean = new Account("Dean", 2142357);
        System.out.println(acc.getName() + " " + acc.getBalance());
        acc.setMinimum_balance(0);
        System.out.println(dean.getName() + " " + dean.getBalance());
        System.out.println("MinBalance: " + acc.getMinimum_balance() + " vs " + dean.getMinimum_balance());
//        Airplane plane = new Airplane();
//        Bird bird = new Bird();
//        Bird bird2 = new Bird();
//        List<Flight> fliers = new ArrayList<>();
//        fliers.add(bird2);
//        fliers.add(plane);
//        fliers.add(bird);
//        for (Flight f: fliers) {
//            f.fly();
//        }
        List<Human> humans = new ArrayList<>();
        humans.add(new Man());
        humans.add(new Man());
        humans.add(new Woman());
        humans.add(new Woman());
        humans.add(new Woman());
        for (Human h : humans) {
            h.sayHello();
        }
    }
}
