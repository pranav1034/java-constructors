public class Student {
    // Public variable (can be accessed anywhere)
    public int rollNumber;

    // Protected variable (accessible within package and subclasses)
    protected String name;

    // Private variable (accessible only within this class)
    private double cgpa;

    // Parameterized Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method to update CGPA
    public void setCgpa(double newCgpa) {
        System.out.println("\nUpdating CGPA to: " + newCgpa);
        this.cgpa = newCgpa;
    }

    // Getter method for CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

// Subclass: PostgraduateStudent (inherits Student)
class PostgraduateStudent extends Student {

    // Constructor to initialize PostgraduateStudent details using super()
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }
    public static void main(String[] args) {
        Student student1 = new Student(1, "Pranav", 9.65);
        student1.displayDetails();

        PostgraduateStudent student2 = new PostgraduateStudent(2, "Nikhil", 9.42);
        student2.displayDetails();

        // Updating CGPA using setter method
        student2.setCgpa(9.68);

        // Displaying updated CGPA using getter method
        System.out.println("\nUpdated CGPA of student 2: " + student2.getCgpa());

        System.out.println("\nComplete details of student 2 after CGPA update:");
        student2.displayDetails();
    }
}
