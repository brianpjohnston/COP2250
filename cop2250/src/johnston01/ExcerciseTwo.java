package johnston01;


/**
 * Brian Johnston
 *
 * chapter_01
 * 5/13/16 10:31 AM
 * <p>
 * 2. Write a program that prompts the user to enter integers to represent the numerator and denominator of an improper fraction. Then, print the equivalent value as a mixed number.
 * For example, 12 / 5 = 2 and 2 / 5.
 */

import java.util.Scanner;

public class ExcerciseTwo {
    public static void main(String[] args) {
        int numerator = 0; //declaring numerator
        int denomenator = 0; //declaring denomenator
        int answer = 0; //declaring answer for whole number
        int remainder = 0; //declaring remainder
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the numerator: "); //asking for numerator
        numerator = scanner.nextInt(); //storing input
        System.out.println("Please enter the denomenator: "); //asking for denomenator
        denomenator = scanner.nextInt();//storing input

        if(denomenator == 0) { // test for divide by zero
            throw new IllegalArgumentException("Denomenator cannot be zero!");
        }

        answer = numerator / denomenator; //determining answer whole number
        remainder = numerator % denomenator; //calculating remainder
        System.out.println("Your answer is: " + answer + " and " + remainder + "/" + denomenator); //displaying results

    }

}


