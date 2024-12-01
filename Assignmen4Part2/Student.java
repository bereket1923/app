package POP.Assignmen4Part2;

public class Student {
    private int id;
    private String name;
    private double gpa;    // GPA is on a scale of 4.0
    private String major;
    private boolean active;
    private Address address;  // Corrected association to Address class

    // Constructor to initialize the student
    public Student(int id, String name, double gpa, String major, boolean active, Address address) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.major = major;
        this.active = active;
        this.address = address;  // Using Address object
    }

    // Method to print GPA in 100 format
    public void printFormat100() {
        double gpa100 = (gpa / 4.0) * 100;  // Convert GPA from 4.0 scale to 100 scale
        System.out.println("GPA in 100 format: " + gpa100);
    }

    // Method to print student's id and name
    public void printStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    // Method to check if the student is active
    public boolean isActive() {
        return active;
    }

    // Method to reset GPA to 0 and change major to given value
    public void newAdmission(String newMajor) {
        this.gpa = 0;
        this.major = newMajor;
    }

    // Getters and Setters if needed
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
    public String getMajor() {
        return major;
    }
    public boolean isActiveStatus() {
        return active;
    }
    public Address getAddress() { // Changed return type to Address
        return address;
    }
}