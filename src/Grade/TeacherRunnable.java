package Grade;

public class TeacherRunnable implements Runnable{
    final Grades stud_grade;

    public TeacherRunnable(Grades stud_grade) {
        this.stud_grade = stud_grade;
    }

    @Override
    public void run() {
        stud_grade.calculateGrade();
    }
}
