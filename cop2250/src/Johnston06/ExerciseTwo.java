package Johnston06;

import java.util.Scanner;

/**
 * Brian Johnston
 * Chapter 6
 * 5/23/2016
 * Write a program that prompts for the user's name.  Then, the program must run a method named stringer that takes the name as its only argument. The stringer method must use a loop to display the name backwards. It should also display the name in alphabetical form, and it should return the number of characters in the name to main, where it can be printed.
 * Collaborators: None
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        //declaring variables
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:"); //prompting for name
        name = scanner.nextLine(); //recording name
        System.out.printf("\nYour name has %.0f characters.", stringer(name)); //printing charachters and calling stringer

    }

    private static double stringer(String name) {
        //declaring variables
        String firstName;
        String lastName;
        int space = name.indexOf(" ");
        int NumofChar = name.length();

        //parsing name to first and last name
        firstName = name.substring(0, space);
        lastName = name.substring(space + 1, name.length());
        System.out.printf("Alphabetically your name is %s, %s", lastName, firstName);

        //figuring out name backwards
        System.out.print("\nYour name backwards is ");
        for (int i = (name.length() - 1); i >= 0; i--) {
            char j = name.charAt(i);
            System.out.print(j);
        }
        //returning number of char in name
        return NumofChar;


    }
}
