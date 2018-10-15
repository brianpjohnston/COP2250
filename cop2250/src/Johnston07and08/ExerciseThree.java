package Johnston07and08;

import java.util.Random;

/**
 * * Brian Johnston
 * Chapter 7&8
 * 5/31/2016
 * Create and initialize a two-dimensional array (3 x 3) of array of doubles. Figure 8.1(c) on page 289 shows how to
 * initialize a 3 x 4 array of ints. Use numbers of your choice to initialize the array elements. Then use nested
 * loops to display the array in rows and columns, with values left-aligned in fields 8 characters wide and accurate
 * to two decimal places.
 * Collaborators: None
 */

public class ExerciseThree {
    public static void main(String[] args) {
        //initializing array
        //initializing array
        double[][] anArray = new double[3][3];

        Random rand = new Random();

        System.out.println("Here is the array");
        //looping through array
        for (int i = 0; i < anArray.length; i++) {
            for (int j = 0; j < anArray.length; j++) {
                anArray[i][j] = rand.nextDouble() * 100;
                System.out.printf("%-8.2f", anArray[i][j]);
            }
            System.out.print("\n");


        }


    }
}