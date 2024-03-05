package Grade;

public class GradeRunnable implements Runnable{
    final Grades my_grade;

    public GradeRunnable(Grades my_grade) {
        this.my_grade = my_grade;
    }

    @Override
    public void run() {
        System.out.println("What is my grade?");
        System.out.println("Yey " + my_grade.getGrade());
    }
}
