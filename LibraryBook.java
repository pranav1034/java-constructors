class LibraryBook {
    final private String title;
    final private String author;
    final private double price;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("Book '" + title + "' has been borrowed.");
            isAvailable = false; // Update availability
        } else {
            System.out.println("Sorry, the book '" + title + "' is already borrowed.");
        }
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the program
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Blue Umbrella", "Ruskin Bond", 999.99);

        book1.displayDetails();
        book1.borrowBook(); // First attempt to borrow
        System.out.println();
        book1.borrowBook(); // Second attempt to borrow (should show "already borrowed")
        book1.displayDetails();
    }
}
