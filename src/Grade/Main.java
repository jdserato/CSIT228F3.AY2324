package Grade;

public class Main {
    public static void main(String[] args) {
        Grades csit227 = new Grades();
        Thread derrick = new Thread(new GradeRunnable(csit227));
        Thread tristan = new Thread(new GradeRunnable(csit227));
        Thread sirvince = new Thread(new TeacherRunnable(csit227));
        derrick.start();
        tristan.start();
        sirvince.start();
        while (true) {
            System.out.println("Derrick: " + derrick.getState());
            System.out.println("tristan: " + tristan.getState());
            System.out.println("sirvince: " + sirvince.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
