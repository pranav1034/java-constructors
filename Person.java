class Person {
    final String name;
    final private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person copy) {
        this.name = copy.name;
        this.age = copy.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an original Person object
        Person person1 = new Person("Pranav", 23);
        System.out.println("Original Person:");
        person1.displayDetails();

        // Creating a copy using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("\nCopied Person:");
        person2.displayDetails();
    }
}
