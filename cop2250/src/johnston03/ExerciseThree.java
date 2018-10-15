package johnston03;

/**
 * Brian Johnston
 *
 *Chapter 3
 * 5/16/2016
 *  Write a program that prompts the user for an even multiple of 19 that is under 1000. Use the modulus operator. Respond to the user's input as appropriate
 * */
import java.util.Scanner;
public class ExerciseThree {
    public static void main(String[] args) {
        int userNum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number that is a multiple of 19 and less than 1000: ");
        userNum = scanner.nextInt();
        if (userNum > 1000) {
            throw new IllegalArgumentException("Please enter a number less than 1000!");
        } else if (userNum % 19 == 0) {
            System.out.println("Your number is a multiple of 19");
        } else if (userNum % 19 != 0) {

            System.out.println("Your number is not a multiple of 19");


        }
    }
}


