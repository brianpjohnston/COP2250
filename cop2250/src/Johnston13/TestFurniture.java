package Johnston13;

import java.util.Arrays;

/**
 * * Brian Johnston
 * 2019405
 * Chapter13
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class TestFurniture {
    public static void main(String[] args) {

        //creating furniture objects and adding to array
        Furniture seating1 = new Seating("recliner", 1200, 1);
        Furniture storage1 = new Storage("Dresser", 600, "clothes", true);
        Furniture seating2 = new Seating("Loveseat", 1500, 2);
        Furniture storage2 = new Storage("Fridge", 1400, "food", true);
        Furniture seating3 = new Seating("Sofa", 2000, 3);
        Furniture seating4 = new Seating("Stool", 140, 2);
        Furniture[] furnArray = {seating1, seating2, seating3, seating4, storage1, storage2};


        //looping through object and printing to verify
        System.out.println("Before ordering by price");
        for (Furniture j : furnArray) {
            System.out.println(j.toString());

        }

        //sorting array by price and outputting to verify
        System.out.println("After ordering by price");
        Arrays.sort(furnArray);
        for (Furniture k : furnArray) {
            System.out.println(k.toString());

        }


    }



}
