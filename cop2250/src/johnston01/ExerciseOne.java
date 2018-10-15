package johnston01;

import java.util.Scanner;

/**
 * Brian Johnston
 *
 * chapter_01
 * 5/13/16 10:31 AM
 * <p>
 * 1. Write a program that prompts the user to enter the unit price and quantity of a merchandise item, then calculates and displays the subtotal, 7% sales tax, and total for the purchase.
 */
public class ExerciseOne {
    public static void main(String[] args) {
        //declaring variables
        double  unitPrice   = 0;
        double salesTax = .07;
        int     quantity    = 0;
        double subtotal = 0;
        double total = 0;
        Scanner scanner     = new Scanner(System.in);

        System.out.println("Enter unit price:"); //prompting unit price
        unitPrice = scanner.nextDouble(); //recording input
        System.out.println("Unit price is: " + unitPrice); //printing unit price
        System.out.println("Enter a quantity: "); //prompting for quantity
        quantity = scanner.nextInt(); //recording quantity
        subtotal = quantity * unitPrice; //calculating subtotal
        System.out.println("The subtotal is:" + subtotal); //printing subtotal
        total = subtotal + (subtotal * salesTax); //calculating total
        System.out.println("Your total is: $" + total); //printing total
    }
}
