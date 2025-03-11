public class Employee {
    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to update salary
    public void setSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("\nUpdated Salary: " + newSalary);
    }

    // Method to get the current salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); //super keyword to access constructor from parent class
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "IT", 60000);
        employee1.displayDetails();

        // Creating a Manager object
        Manager manager1 = new Manager(102, "HR", 90000);
        manager1.displayDetails(); // Displaying details of mgr1

        // Updating salary using setter method
        manager1.setSalary(95000);

        // Displaying updated salary using getter method
        System.out.println("\nUpdated Salary of Manager: " + manager1.getSalary());

        System.out.println("\nComplete details of Manager after salary update:");
        manager1.displayDetails();
    }
}
