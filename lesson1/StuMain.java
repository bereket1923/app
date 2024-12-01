package POP.lesson1;

public class StuMain {
    public static void main(String[] args) {
        // declare an object of the Lesson1.Student class
        Stu miu;
        //create object for student and assign it to miu
        miu = new Stu();
//        miu.studentId =118384;
//        miu.studentName ="Bereket";
//        miu.studentPhoneNumber =54750;
//        System.out.println(miu.studentId);
//        System.out.println(miu.studentName);
//        System.out.println(miu.studentPhoneNumber);
        // Set values using setter methods
        miu.setStudentId(118384);
        miu.setStudentName("Bereket");
        miu.setStudentPhoneNumber(54750);
        // Get and display the values using getter methods
        System.out.println(miu.getStudentId());
        System.out.println(miu.getStudentName());
        System.out.println(miu.getStudentPhoneNumber());

    }
}
