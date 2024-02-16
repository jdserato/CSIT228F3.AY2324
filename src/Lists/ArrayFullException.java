package Lists;

public class ArrayFullException extends Exception {
    ArrayFullException(int num) {
        super("The array is full and " + num
                + " cannot be inserted.");
    }
}
