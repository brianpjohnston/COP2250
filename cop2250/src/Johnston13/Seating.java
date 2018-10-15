package Johnston13;


/**
 * * Brian Johnston
 * 2019405
 * Chapter13
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class Seating extends Furniture {
    //declaring variables
    private int capacity;

    //default constructor
    Seating(String inputtedItem, double inputtedPrice, int inputtedCapacity) {
        super(inputtedItem, inputtedPrice);
        capacity = inputtedCapacity;
    }

    //seating to string
    public String toString() {
        String results = super.toString() + ". Capacity:" + capacity + returnPurpose();
        return results;
    }

    //returnPurpose method returns string
    public String returnPurpose() {
        String results = ". Used for sitting";
        return results;
    }

    //compare to method
    public int compareTo(Seating s) {
        return super.compareTo(s);

    }



}
