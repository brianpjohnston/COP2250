package Johnston07and08;

import java.util.Arrays;
import java.util.Random;


/**
 * Brian Johnston
 * Chapter 7&8
 * 5/26/2016
 * Use a for loop to generate an array of ten random integers, all in the range from 100 to 200, inclusive.
 * Use the Arrays class to both sort and display the entire array. Next, pass the array as the only argument
 * to a method that doubles each element of the array and then returns the array. Use a foreach loop to show
 * all elements in the returned array on one line separated by a single space. This latter loop should also
 * determine the sum of all elements in the returned array. Display the sum with a "thousands" comma as in the
 * sample output.
 * SAMPLE OUTPUT
 * [106, 114, 118, 126, 130, 132, 169, 183, 192, 195]
 * 212 228 236 252 260 264 338 366 384 390
 * The total is 2,930
 * Collaborators: None
 */
public class ExcerciseOne {

    public static void main(String[] args) {
        Random rand = new Random(); //random variable
        int[] anArray; //initializing array
        anArray = new int[10]; //setting array size

        //populating the array
        for (int i = 0; i < anArray.length; i++) {
            int n = rand.nextInt(100) + 101;
            anArray[i] = n;

        }

        //sorting and displaying the array
        Arrays.sort(anArray);
        System.out.println(Arrays.toString(anArray));

        //calling the doubler method
        doubler(anArray);

        //intital total
        int total = 0;
        //printing each element in the array and calc total
        for (int l : anArray) {
            System.out.print(l + " ");
            total += l;
        }
        //printing total
        System.out.printf("\nThe total is: %,d ", total);

    }

    //This method doubles the array and returns the array
    private static int[] doubler(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        return array;


    }
}


















