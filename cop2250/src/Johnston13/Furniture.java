package Johnston13;

/**
 * * Brian Johnston
 * 2019405
 * Chapter13
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public abstract class Furniture implements Comparable<Furniture> {
    //variables
    private String item;
    private double price;

    //default constructor
    Furniture(String inputtedItem, double inputtedPrice) {
        item = inputtedItem;
        price = inputtedPrice;
    }

    //getprice
    double getPrice() {
        return this.price;
    }

    //furniture to string
    public String toString() {
        String results = "Furniture item: " + item + ", price = $" + price;
        return results;
    }

    //compares price
    public int compareTo(Furniture f) {
        if (getPrice() > f.getPrice()) {
            return 1;
        } else if (getPrice() < f.getPrice()) {
            return -1;
        } else
            return 0;

    }


    public abstract String returnPurpose();

}
