package POP.Lesson5;

public class Student {
    private String tName;  // Student's name
    private double score;  // Student's score

    // Getter and setter for tName
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    // Getter and setter for score
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Constructor to initialize tName and score
    public Student(String tName, double score) {
        this.tName = tName;  // Assign tName
        this.score = score;  // Assign score
    }

    // Method to check if the student has passed
    public boolean hasPassed() {
        return score >= 82;  // Return true if score is 82 or higher
    }

    // Method to display exam results
    public void displayExamResult() {
        if (hasPassed()) {
            System.out.println("You passed with a score of " + score + "!");
        } else {
            System.out.println("You failed with a score of " + score + "!");
        }
    }
}
