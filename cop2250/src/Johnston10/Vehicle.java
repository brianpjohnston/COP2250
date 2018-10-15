package Johnston10;


/**
 * * Brian Johnston
 * 2019405
 * Chapter10
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class Vehicle {

    //declaring variables
    private String make;
    private String model;
    private int year;
    private double price;
    private Motor motor;

    //vehicle constructor
    Vehicle(String inputMake, String inputModel, int inputYear, double inputPrice, int inputtedCylnders, int inputtedHP, String inputtedtype) {
        make = inputMake;
        model = inputModel;
        year = inputYear;
        price = inputPrice;
        motor = new Motor(inputtedCylnders, inputtedHP, inputtedtype);

    }

    //getprice
    double getPrice() {
        return this.price;
    }

    //setprice
    void setPrice(double price) {
        this.price = price;
    }

    //tostring for vehicle
    public String toString() {
        String result = year + " " + make + " " + model + " price=" + price + "\n" + motor.toString();
        return result;


    }
}
