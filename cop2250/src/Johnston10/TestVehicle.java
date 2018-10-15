package Johnston10;

/**
 * * Brian Johnston
 * 2019405
 * Chapter10
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class TestVehicle {
    public static void main(String[] args) {

        //constructors for vehicles
        Vehicle vehicle1 = new Vehicle("Dodge", "Challenger Hellcat", 2016, 63000.43, 8, 707, "Gas");
        Vehicle vehicle2 = new Vehicle("Scion", "FRS", 2014, 33000.95, 4, 295, "Gas");
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 2012, 22000.00, 6, 405, "Gas");

        //calling printme method to output results
        printMe(vehicle1);
        printMe(vehicle2);
        printMe(vehicle3);

    }

    //prints output of vehicle
    private static void printMe(Vehicle p) {
        System.out.println("\n" + p);
    }


}
