package Bank;

public class Main {
    public static void main(String[] args) {
        Account akoa = new Account("Vince", 1000);
        Thread lazada = new Thread(new TransactionRunnable(akoa, 700));
        Thread hoyo = new Thread(new TransactionRunnable(akoa, 280));
        Thread shopee = new Thread(new TransactionRunnable(akoa, 500));

        shopee.start();
        lazada.start();
        hoyo.start();
        try {
            Thread.sleep(1000);
            System.out.println("After 1 seconds");
            System.out.println("Shopee status " + shopee.getState());
            System.out.println("Lazada status " + lazada.getState());
            System.out.println("hoyo status " + hoyo.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
            System.out.println("After 2 seconds");
            System.out.println("Shopee status " + shopee.getState());
            System.out.println("Lazada status " + lazada.getState());
            System.out.println("hoyo status " + hoyo.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
            System.out.println("After 3 seconds");
            System.out.println("Shopee status " + shopee.getState());
            System.out.println("Lazada status " + lazada.getState());
            System.out.println("hoyo status " + hoyo.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
            System.out.println("After 4 seconds");
            System.out.println("Shopee status " + shopee.getState());
            System.out.println("Lazada status " + lazada.getState());
            System.out.println("hoyo status " + hoyo.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
            System.out.println("After 5 seconds");
            System.out.println("Shopee status " + shopee.getState());
            System.out.println("Lazada status " + lazada.getState());
            System.out.println("hoyo status " + hoyo.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
