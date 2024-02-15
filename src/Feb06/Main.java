package Feb06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, num1=0;
        try {
            System.out.println("Me gonna return");
            Animal animal = new Animal();
            System.out.print("Enter age: ");
            animal.setAge(sc.nextInt());
            animal.birthday();
            System.out.println("Age of animal is " + animal.age);
        }catch (RuntimeException e) {
            System.out.println("Exception: "+e.getClass());
            if (e instanceof InputMismatchException) {
                System.out.println("Me a inputmisexception");
            }
        } catch (Exception e) {
            System.out.println("stuff");
        }
        finally {
            System.out.println("MANA YEY");
        }
    }
}
