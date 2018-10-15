package johnston04;

import java.util.Scanner;

/**
 * Brian Johnston
 *
 *Chapter 4
 * 5/18/2016
 *  Prompt the user to enter his/her first name and last name as one string and then:
 *
  *Display the name in all upper case.
  *Display the length of the full name, length of the first name, and length of the last name.
  *Display the name in the usual alphabetical manner. That's last name, comma, space, first name as in Hancock, John.
   *Display the user's initials, as in JH.
 * */
public class ExerciseThree {
    public static void main(String[] args) {
        String name ;
        String firstName ;
        String lastName ;
        Scanner scanner     = new Scanner(System.in);

        System.out.println("Please enter your first and last name:");
        name = scanner.nextLine();

        System.out.println(name.toUpperCase());
        int space = name.indexOf(" ");
        firstName = name.substring(0, space);
        lastName = name.substring(space + 1, name.length());

        System.out.println("Your first name is " + firstName.length() + " characters. " + "Your last name is " + lastName.length() + " characters.");
        System.out.println(lastName + ", " + firstName);
        System.out.print(firstName.charAt(0));
        System.out.print(lastName.charAt(0));


    }
}
