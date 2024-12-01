package POP.Assignmen4Part2;

public class Main {

    public static void main(String[] args) {
        // Step 1: Create Address objects for each student
        Address address1 = new Address("123 Main St", "Springfield", "IL", "62704");
        Address address2 = new Address("456 Elm St", "Springfield", "IL", "62705");
        Address address3 = new Address("789 Oak St", "Springfield", "IL", "62706");

        // Step 2: Create Student objects and pass the Address objects
        Student student1 = new Student(1001, "John Doe", 3.5, "Computer Science", true, address1);
        Student student2 = new Student(1002, "Jane Smith", 2.8, "Mathematics", false, address2);
        Student student3 = new Student(1003, "Emily Johnson", 3.9, "Physics", true, address3);

        // Step 3: Apply the specified actions for student1
        // Print the student’s GPA in the (100) format
        System.out.println("GPA for " + student1.getName() + " in 100 format:");
        student1.printFormat100(); // Converts and prints GPA in percentage

        // Print the student’s info
        System.out.println("\nStudent Information:");
        student1.printStudentInfo();  // Prints student ID and name

        // Check if the student is active
        System.out.println("\nActive Status:");
        if (student1.isActive()) {
            System.out.println("The student is currently active.");
        } else {
            System.out.println("The student is not active.");
        }

        // Optionally, print the student's address
        System.out.print("\nStudent Address: ");
        student1.getAddress().printAddress(); // Using Address object to print the address

        // Optionally, print details for the other students (if needed)
        System.out.println("\nOther Students:");
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}