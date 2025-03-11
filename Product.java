public class Product {
    //class variable
    private static int totalProducts = 0;

    // Instance variables
    final private String productName;
    final private double price;

    // Parameterized Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total product count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 12000);
        Product p2 = new Product("Mobile Phone", 8000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
