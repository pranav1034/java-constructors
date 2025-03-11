public class Vehicle {
    //instance variables
    final private String ownerName;
    final private String vehicleType;

    //class variable
    private static int registrationFee= 500;

    //Parameterized constructor
    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    //instance method
    public void displayVehicleDetails(){
        System.out.println("\nThe owner of the vehicle is: "+ownerName);
        System.out.println("The type of the vehicle is: "+vehicleType);
        System.out.println("The registration fee is: "+registrationFee);
    }

    //class method
    public static void updateRegistrationFees(int newRegistrationFee){
        System.out.println("\nThe new registration fees is: "+newRegistrationFee);
        registrationFee = newRegistrationFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Pranav","Car");
        Vehicle vehicle2 = new Vehicle("Nikhil","Activa");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        updateRegistrationFees(1000); //change fees using class method

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}