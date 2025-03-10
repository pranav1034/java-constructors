class HotelBooking {
    final private String guestName;
    final private String roomType;
    final private int nights;

    // Default Constructor
    public HotelBooking() {
        this("Unknown Guest", "Unknown", 0); // Calls the parameterized constructor with default values
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking copy) {
        this.guestName = copy.guestName;
        this.roomType = copy.roomType;
        this.nights = copy.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        // Using parameterized constructor
        HotelBooking customBooking = new HotelBooking("Pranav", "Standard", 4);
        System.out.println("\nCustom Booking:");
        customBooking.displayBooking();

        // Using copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBooking();
    }
}