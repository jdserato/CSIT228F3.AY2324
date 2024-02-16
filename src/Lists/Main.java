package Lists;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        try {
            list.add(10);
//            list.add(2);
            list.add(30);
            list.add(40);
            list.add(50);
            list.addAt(5, 60);
            list.addAt(2, 20);
//            list.add(6);
            list.print();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            list.print();
        }
    }
}
