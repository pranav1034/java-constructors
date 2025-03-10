class Book {
    final private String title;
    final private String author;
    final private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayDetails();

        // Using parameterized constructor
        Book customBook = new Book("The Blue Umbrella", "Ruskin Bond", 999.99);
        System.out.println("\nCustom Book Details:");
        customBook.displayDetails();
    }
}