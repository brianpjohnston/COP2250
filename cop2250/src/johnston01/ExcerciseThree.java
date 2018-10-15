package johnston01;

/**
 * * Brian Johnston
 *
 * chapter_01
 * 5/13/16 10:31 AM
 * <p>
 * 3. A customer pays for a purchase of an inexpensive item with a $1 bill. Write a program that will give the customer change with the fewest possible number of coins. Ignore tax. Your program should prompt the user for the item price of the purchase.
 */

import java.util.Scanner;

public class ExcerciseThree {
    public static void main(String[] args) {
        //declaring variables
        int purchasePrice = 0;
        int change = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int penny = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the purchase price in cents (as an integer): "); //prompt for purchase price
        purchasePrice = scanner.nextInt(); //storing purchase price
        change = 100 - purchasePrice; //calculating change
        System.out.println("Your change is " + change + " cents as follows."); //displaying change
        quarters = change / 25; //calculating number of quarters
        change = change - (quarters * 25); //calculating new change
        dimes = change / 10; //calc number of dimes
        change = change - (dimes * 10); //calculating new change
        nickels = change / 5; //calc num of nickels
        change = change - (nickels * 5); //calculating new change
        penny = change / 1; //calc pennies

        System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + penny + " pennies"); //displaying results
    }

}
