package Grade;

import java.util.Random;

public class Grades {
    Double grade = new Double(0);
    public void calculateGrade() {
        synchronized (grade) {
            Random r = new Random();
            System.out.println("Sleeping sah");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("Oke back to work");
            grade = (r.nextDouble() + 1) * 2.5;
            System.out.println("Oke imo grade kay " + grade);
            grade.notify();
        }
    }

    public boolean hasGrade() {
        return grade != 0;
    }

    public double getGrade() {
        synchronized (grade) {
            try {
                grade.wait();
            } catch (InterruptedException e) {
            }
            return grade;
        }

    }
}
