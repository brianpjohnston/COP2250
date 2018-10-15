package Johnston07and08;

import java.util.Arrays;

/**
 * Brian Johnston
 * Chapter 7&8
 * 5/31/2016
 * Write a method that can take a variable number of int arguments and return the sum of these arguments. The ints to
 * be summed up must be entered as command line arguments. Command line arguments can be simulated in Eclipse. Watch
 * the video. In the main method, display the ints that were entered on the command line. Then execute the method and
 * display the sum it returns.
 * Collaborators: None
 */
public class ExerciseTwo {
    public static void main(String[] args) {

        //printing the arguyments that are passed
        System.out.println("Passing " + Arrays.toString(args));

        //putting arguments in numbers array
        int numbersArray[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbersArray[i] = Integer.valueOf(args[i]);
        }
        //calling sum method and returning the sum
        int sum = sum(numbersArray);
        System.out.print("Sum is " + sum);

    }


    //sum method adds up the sum
    private static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}


