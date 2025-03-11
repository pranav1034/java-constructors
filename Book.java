public class Book {
    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor 
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author
    public String getAuthor() {
        return author;
    }

    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    // Constructor to initialize EBook details using super()
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("111-222-333", "Java Programming", "James Gosling");
        book1.displayDetails(); // Displaying details of book1

        EBook ebook1 = new EBook("111-222-334", "Python for Beginners", "Guido van Rossum");
        ebook1.displayDetails(); // Displaying details of ebook1

        // Updating author using setter method
        ebook1.setAuthor("Pranav Aggarwal");

        // Displaying updated author using getter method
        System.out.println("\nUpdated Author of eBook: " + ebook1.getAuthor());

        System.out.println("\nComplete details of eBook after author update:");
        ebook1.displayDetails();
    }
}
