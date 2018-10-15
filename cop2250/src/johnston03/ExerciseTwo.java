package johnston03;
import java.util.Scanner;

/**
 * Brian Johnston
 *
 *Chapter 3
 * 5/16/2016
 * Write a program for WaterWorld that prompts for the age of a park guest and then reports the price of admission. Daily park fees are shown below. Note: children under 4 years of age are not allowed in WallyWorld. Take this into account, too.
 *
 *Adults 20 and up: $45.00
 *Youths 12 to 19: $30.00
 *Children 4 to 11: $20.00
 * */
public class ExerciseTwo {
    public static void main(String[] args) {
        double adultPrice = 45.00;
        double youthPrice = 30.00;
        double childrenPrice = 20.00;
        int yourAge = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        yourAge = scanner.nextInt();
        if (yourAge > 19) {
            System.out.println("Your ticket price is $" + String.format("%.2f", adultPrice));
        }else if (yourAge >= 12 && yourAge < 20) {
            System.out.println("Your ticket price is $" + String.format("%.2f", youthPrice));
        } else if (yourAge >= 4 && yourAge <12) {
                    System.out.println("Your ticket price is $" + String.format("%.2f", childrenPrice));
                }

         else {
            System.out.println("You are too young for Water World!");

        }


    }

}
