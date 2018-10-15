package Johnston13;

/**
 * * Brian Johnston
 * 2019405
 * Chapter13
 * Assignment in text document labeled requirements
 * Collaborators: None
 * */

public class Storage extends Furniture {
    //declaring variables
    private String use;
    private boolean isElectric;

    //default constructor
    Storage(String inputtedItem, double inputtedPrice, String inputtedUse, boolean inputtedIsElectric) {
        super(inputtedItem, inputtedPrice);
        use = inputtedUse;
        isElectric = inputtedIsElectric;
    }

    //to string method
    public String toString() {
        String results = super.toString() + ". Powered: " + isElectric + returnPurpose() + use;
        return results;
    }

    //return purpose to string
    public String returnPurpose() {
        String results = ". Used for storing ";
        return results;
    }

    //compare to
    public int compareTo(Storage s) {
        return super.compareTo(s);


    }

}
