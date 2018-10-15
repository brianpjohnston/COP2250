package Johnston12;


import java.util.Scanner;

/**
 * * Brian Johnston
 * 2019405
 * Chapter12
 * Assignment in text document labeled requirements
 * Collaborators: None
 */

public class ExerciseOne {
    public static void main(String[] args) throws Exception {

        //declaring variables
        Scanner scanner = new Scanner(System.in);
        int[] intArray = {7, 56, 95, 70, 45, 35};
        //user prompt
        System.out.println("Please enter an int");
        //storing int
        int userinput = scanner.nextInt();


        //checks if element is in array
        checkint(userinput, intArray);

    }


    private static void checkint(int input, int[] array) throws Exception {
        boolean valid = false;

        for (int i = 0; i < array.length; i++) {
            if (input == array[i]) {
                System.out.printf("Your input matches the %d element of the array.\n", i);
                valid = true;

            }
        }
        if (!valid) {
            throw new Exception("Element is not in the array");

        }


    }

}












