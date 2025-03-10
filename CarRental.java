public class CarRental {
    final private String customerName;
    final private String carModel;
    final private int rentalDays;
    final private double dailyRate = 300.0; // Fixed daily rental rate

    // Default Constructor
    public CarRental() {
        this("Unknown Customer", "Unknown Model", 0); // Calls parameterized constructor with default values
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy Constructor
    public CarRental(CarRental copy) {
        this.customerName = copy.customerName;
        this.carModel = copy.carModel;
        this.rentalDays = copy.rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        // Using parameterized constructor
        CarRental customRental = new CarRental("Pranav", "Audi", 5);
        System.out.println("\nCustom Rental:");
        customRental.displayRentalDetails();

        // Using copy constructor
        CarRental copiedRental = new CarRental(customRental);
        System.out.println("\nCopied Rental:");
        copiedRental.displayRentalDetails();
    }
}
