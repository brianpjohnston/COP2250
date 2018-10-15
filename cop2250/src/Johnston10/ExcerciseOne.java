package Johnston10;

import java.util.Scanner;

/**
 * * Brian Johnston
 * 2019405
 * Chapter10
 *  Collaborators: None
 * Write a Java program that prompts the user to enter a security code that matches a specific regular expression
 * pattern. Your program must approve the user's entry. Refer to section 10.10.4 and Appendix H.
 * Here is the pattern:
 * An upper case character, a lower case character, an upper case character, a lower case character,4 digits, 2 or 3
 * lower case letters, 2 upper case characters, 1 digit.
 */
public class ExcerciseOne {
    public static void main(String[] args) {
        //declaring variables
        String password;
        String passwordPattern = "([A-Z])([a-z])([A-Z])([a-z])([\\d]{4})([a-z]{2,3})([A-Z]){2}([0-9])";
        Scanner scanner = new Scanner(System.in);

        //prompting for pattern
        System.out.println("Enter the code pattern");

        //storing pattern
        password = scanner.next();

        //checking if pattern matches
        if (password.matches(passwordPattern)) {
            System.out.printf("Yes, %s matches the pattern", password);
        } else {
            System.out.printf("No, %s does not matches the pattern", password);
        }

    }
}
