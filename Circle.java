class Circle {
    final private double radius;

    // Default Constructor
    public Circle() {
        this(3.0); // Calls the parameterized constructor with default radius
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        // Using parameterized constructor
        Circle customCircle = new Circle(9.0);
        System.out.println("\nCustom Circle:");
        customCircle.displayDetails();
    }
}
