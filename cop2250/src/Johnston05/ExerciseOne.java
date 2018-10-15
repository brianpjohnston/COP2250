package Johnston05;

import java.util.Scanner;

/**
 * Brian Johnston
 *
 *Chapter 5
 * 5/19/2016
 *  Write a Java program that can add up and count a series (any number) of integers entered by the user. Use a loop and stop the loop when the user enters a value of zero. Then, display the count, total and average. Express the average accurate to three decimal places
 *  Collaborators: None
 * */
public class ExerciseOne {
    public static void main(String[] args) {
        double count = 0;
        int input;
        int i = -1;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number or 0 to quit: ");
            input = scanner.nextInt();
            count += input;
            i++;


        }
        while (input != 0);

        double avg = count / i;
        System.out.println("The total of those " + i + " numbers: is " + (int) count + ".");
        System.out.println("The average is " + String.format("%.3f", avg));
    }


}
