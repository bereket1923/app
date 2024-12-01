package POP.Lesson5;

public class studentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John", 85);
        Student student2 = new Student("tom", 60.5);

        student1.displayExamResult(); // Output: You passed with a score of 85!
        student2.displayExamResult();
    }
}